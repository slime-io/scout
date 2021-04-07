/* Jackson JSON-processor.
 *
 * Copyright (c) 2007- Tatu Saloranta, tatu.saloranta@iki.fi
 */

package scalapb.json4s.base64

import java.io.OutputStream
import java.util
import scala.util.control.Breaks._


/**
 * Helper class that is similar to {@link java.io.ByteArrayOutputStream}
 * in usage, but more geared to Jackson use cases internally.
 * Specific changes include segment storage (no need to have linear
 * backing buffer, can avoid reallocations, copying), as well API
 * not based on {@link OutputStream}. In short, a very much
 * specialized builder object.
 * <p>
 * Also implements {@link OutputStream} to allow
 * efficient aggregation of output content as a byte array, similar
 * to how {@link java.io.ByteArrayOutputStream} works, but somewhat more
 * efficiently for many use cases.
 * <p>
 * NOTE: maximum size limited to Java Array maximum, 2 gigabytes: this
 * because usage pattern is to collect content for a `byte[]` and so although
 * theoretically this builder can aggregate more content it will not be usable
 * as things are. Behavior may be improved if we solve the access problem.
 */
object ByteArrayBuilder {
  val NO_BYTES = new Array[Byte](0)
  // Size of the first block we will allocate.
  private val INITIAL_BLOCK_SIZE = 500
  // Maximum block size we will use for individual non-aggregated
  // blocks. Let's limit to using 256k chunks.
  private val MAX_BLOCK_SIZE = 1 << 18
  private[base64] val DEFAULT_BLOCK_ARRAY_SIZE = 40
}

final class ByteArrayBuilder( // Optional buffer recycler instance that we can use for allocating the first block.
                              val _bufferRecycler: BufferRecycler, val firstBlockSize: Int) extends OutputStream {
  private var _pastLen = 0
  private var _currBlockPtr = 0
  private var _currBlock: Array[Byte] = if (_bufferRecycler == null) new Array[Byte](firstBlockSize)
  else _bufferRecycler.allocByteBuffer(BufferRecycler.BYTE_WRITE_CONCAT_BUFFER)

  final private val _pastBlocks = new util.LinkedList[Array[Byte]]
  // Number of bytes within byte arrays in {@link _pastBlocks}.
  def this(br: BufferRecycler) {
    this(br, ByteArrayBuilder.INITIAL_BLOCK_SIZE)
  }
  def this() {
    this(null)
  }
  def this(firstBlockSize: Int) {
    this(null, firstBlockSize)
  }
  def reset(): Unit = {
    _pastLen = 0
    _currBlockPtr = 0
    if (!_pastBlocks.isEmpty) _pastBlocks.clear()
  }
  /**
   * @since 2.9
   */
  def size = _pastLen + _currBlockPtr
  /**
   * Clean up method to call to release all buffers this object may be
   * using. After calling the method, no other accessors can be used (and
   * attempt to do so may result in an exception)
   */
  def release(): Unit = {
    reset()
    if (_bufferRecycler != null && _currBlock != null) {
      _bufferRecycler.releaseByteBuffer(BufferRecycler.BYTE_WRITE_CONCAT_BUFFER, _currBlock)
      _currBlock = null
    }
  }
  def append(i: Int): Unit = {
    if (_currBlockPtr >= _currBlock.length) _allocMore()
    _currBlock({
      _currBlockPtr += 1; _currBlockPtr - 1
    }) = i.toByte
  }
  def appendTwoBytes(b16: Int): Unit = {
    if ((_currBlockPtr + 1) < _currBlock.length) {
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = (b16 >> 8).toByte
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = b16.toByte
    }
    else {
      append(b16 >> 8)
      append(b16)
    }
  }
  def appendThreeBytes(b24: Int): Unit = {
    if ((_currBlockPtr + 2) < _currBlock.length) {
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = (b24 >> 16).toByte
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = (b24 >> 8).toByte
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = b24.toByte
    }
    else {
      append(b24 >> 16)
      append(b24 >> 8)
      append(b24)
    }
  }
  def appendFourBytes(b32: Int): Unit = {
    if ((_currBlockPtr + 3) < _currBlock.length) {
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = (b32 >> 24).toByte
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = (b32 >> 16).toByte
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = (b32 >> 8).toByte
      _currBlock({
        _currBlockPtr += 1; _currBlockPtr - 1
      }) = b32.toByte
    }
    else {
      append(b32 >> 24)
      append(b32 >> 16)
      append(b32 >> 8)
      append(b32)
    }
  }
  /**
   * Method called when results are finalized and we can get the
   * full aggregated result buffer to return to the caller
   */
  def toByteArray: Array[Byte] = {
    val totalLen = _pastLen + _currBlockPtr
    if (totalLen == 0) { // quick check: nothing aggregated?
      return ByteArrayBuilder.NO_BYTES
    }
    val result = new Array[Byte](totalLen)
    var offset = 0
    import scala.jdk.CollectionConverters._
    for (block <- _pastBlocks.asScala) {
      val len = block.length
      System.arraycopy(block, 0, result, offset, len)
      offset += len
    }
    System.arraycopy(_currBlock, 0, result, offset, _currBlockPtr)
    offset += _currBlockPtr
    if (offset != totalLen) { // just a sanity check
      throw new RuntimeException("Internal error: total len assumed to be " + totalLen + ", copied " + offset + " bytes")
    }
    // Let's only reset if there's sizable use, otherwise will get reset later on
    if (!_pastBlocks.isEmpty) reset()
    result
  }
  /**
   * Method called when starting "manual" output: will clear out
   * current state and return the first segment buffer to fill
   */
  def resetAndGetFirstSegment = {
    reset()
    _currBlock
  }
  /**
   * Method called when the current segment buffer is full; will
   * append to current contents, allocate a new segment buffer
   * and return it
   */
  def finishCurrentSegment = {
    _allocMore()
    _currBlock
  }
  /**
   * Method that will complete "manual" output process, coalesce
   * content (if necessary) and return results as a contiguous buffer.
   *
   * @param lastBlockLength Amount of content in the current segment
   *                        buffer.
   * @return Coalesced contents
   */
  def completeAndCoalesce(lastBlockLength: Int) = {
    _currBlockPtr = lastBlockLength
    toByteArray
  }
  def getCurrentSegment = _currBlock
  def setCurrentSegmentLength(len: Int): Unit = {
    _currBlockPtr = len
  }
  def getCurrentSegmentLength = _currBlockPtr
  override def write(b: Array[Byte]): Unit = {
    write(b, 0, b.length)
  }
  override def write(b: Array[Byte], _off: Int, _len: Int): Unit = {
    var off = _off
    var len = _len
    breakable {
      while ( {
        true
      }) {
        val max = _currBlock.length - _currBlockPtr
        val toCopy = Math.min(max, len)
        if (toCopy > 0) {
          System.arraycopy(b, off, _currBlock, _currBlockPtr, toCopy)
          off += toCopy
          _currBlockPtr += toCopy
          len -= toCopy
        }
        if (len <= 0) break //todo: break is not supported
        _allocMore()
      }
    }
  }
  override def write(b: Int): Unit = {
    append(b)
  }
  override def close(): Unit = {
    /* NOP */
  }
  override def flush(): Unit = {
  }
  private def _allocMore(): Unit = {
    val newPastLen = _pastLen + _currBlock.length
    // 13-Feb-2016, tatu: As per [core#351] let's try to catch problem earlier;
    //     for now we are strongly limited by 2GB limit of Java arrays
    if (newPastLen < 0) throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`")
    _pastLen = newPastLen
    /* Let's allocate block that's half the total size, except
             * never smaller than twice the initial block size.
             * The idea is just to grow with reasonable rate, to optimize
             * between minimal number of chunks and minimal amount of
             * wasted space.
             */ var newSize = Math.max(_pastLen >> 1, ByteArrayBuilder.INITIAL_BLOCK_SIZE + ByteArrayBuilder.INITIAL_BLOCK_SIZE)
    // plus not to exceed max we define...
    if (newSize > ByteArrayBuilder.MAX_BLOCK_SIZE) newSize = ByteArrayBuilder.MAX_BLOCK_SIZE
    _pastBlocks.add(_currBlock)
    _currBlock = new Array[Byte](newSize)
    _currBlockPtr = 0
  }
}
