package scalapb.json4s.base64

object BufferRecycler {
  val BYTE_READ_IO_BUFFER = 0
  val BYTE_WRITE_ENCODING_BUFFER = 1
  val BYTE_WRITE_CONCAT_BUFFER = 2
  val BYTE_BASE64_CODEC_BUFFER = 3
  val CHAR_TOKEN_BUFFER = 0 // Tokenizable input

  val CHAR_CONCAT_BUFFER = 1 // concatenated output

  val CHAR_TEXT_BUFFER = 2 // Text content from input

  val CHAR_NAME_COPY_BUFFER = 3 // Temporary buffer for getting name characters

  private val BYTE_BUFFER_LENGTHS = Array[Int](8000, 8000, 2000, 2000)
  private val CHAR_BUFFER_LENGTHS = Array[Int](4000, 4000, 200, 200)
}

class BufferRecycler protected(val bbCount: Int, val cbCount: Int) {
  _byteBuffers = new Array[Array[Byte]](bbCount)
  _charBuffers = new Array[Array[Char]](cbCount)
  final protected var _byteBuffers: Array[Array[Byte]] = null
  final protected var _charBuffers: Array[Array[Char]] = null
  def this() {
    this(4, 4)
  }
  final def allocByteBuffer(ix: Int): Array[Byte] = allocByteBuffer(ix, 0)
  def allocByteBuffer(ix: Int, _minSize: Int) = {
    var minSize = _minSize
    val DEF_SIZE = byteBufferLength(ix)
    if (minSize < DEF_SIZE) minSize = DEF_SIZE
    var buffer = _byteBuffers(ix)
    if (buffer == null || buffer.length < minSize) buffer = balloc(minSize)
    else _byteBuffers(ix) = null
    buffer
  }
  def releaseByteBuffer(ix: Int, buffer: Array[Byte]): Unit = {
    _byteBuffers(ix) = buffer
  }
  final def allocCharBuffer(ix: Int): Array[Char] = allocCharBuffer(ix, 0)
  def allocCharBuffer(ix: Int, _minSize: Int) = {
    var minSize = _minSize
    val DEF_SIZE = charBufferLength(ix)
    if (minSize < DEF_SIZE) minSize = DEF_SIZE
    var buffer = _charBuffers(ix)
    if (buffer == null || buffer.length < minSize) buffer = calloc(minSize)
    else _charBuffers(ix) = null
    buffer
  }
  def releaseCharBuffer(ix: Int, buffer: Array[Char]): Unit = {
    _charBuffers(ix) = buffer
  }
  protected def byteBufferLength(ix: Int): Int = BufferRecycler.BYTE_BUFFER_LENGTHS(ix)
  protected def charBufferLength(ix: Int): Int = BufferRecycler.CHAR_BUFFER_LENGTHS(ix)
  protected def balloc(size: Int) = new Array[Byte](size)
  protected def calloc(size: Int) = new Array[Char](size)
}
