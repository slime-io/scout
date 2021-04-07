/* Jackson JSON-processor.
 *
 * Copyright (c) 2007- Tatu Saloranta, tatu.saloranta@iki.fi
 */
package scalapb.json4s.base64


import java.util
import scala.util.control.Breaks._


/**
 * Class used to define specific details of which
 * variant of Base64 encoding/decoding is to be used. Although there is
 * somewhat standard basic version (so-called "MIME Base64"), other variants
 * exists, see <a href="http://en.wikipedia.org/wiki/Base64">Base64 Wikipedia entry</a> for details.
 *
 * @author Tatu Saloranta
 */
@SerialVersionUID(1L)
object Base64Variant {
  private val STD_BASE64_ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
  var MIME_NO_LINEFEEDS = new Base64Variant(new Base64Variant("MIME", STD_BASE64_ALPHABET, true, '=', 76), "MIME-NO-LINEFEEDS", Integer.MAX_VALUE)
  private val INT_SPACE = 0x20
  /**
   * Marker used to denote ascii characters that do not correspond
   * to a 6-bit value (in this variant), and is not used as a padding
   * character.
   */
  val BASE64_VALUE_INVALID = -1
  /**
   * Marker used to denote ascii character (in decoding table) that
   * is the padding character using this variant (if any).
   */
  val BASE64_VALUE_PADDING = -2
}

@SerialVersionUID(1L)
final class Base64Variant extends Serializable {
  /**
   * Decoding table used for base 64 decoding.
   */
  final private val _asciiToBase64 = new Array[Int](128)
  /**
   * Encoding table used for base 64 decoding when output is done
   * as characters.
   */
  final private val _base64ToAsciiC = new Array[Char](64)
  /**
   * Alternative encoding table used for base 64 decoding when output is done
   * as ascii bytes.
   */
  final private val _base64ToAsciiB = new Array[Byte](64)
  /**
   * Symbolic name of variant; used for diagnostics/debugging.
   * <p>
   * Note that this is the only non-transient field; used when reading
   * back from serialized state.
   * <p>
   * Also: must not be private, accessed from `BaseVariants`
   */
  final private[base64] var _name: String = null
  /**
   * Whether this variant uses padding or not.
   */
  final private var _usesPadding = false
  /**
   * Characted used for padding, if any ({@link #PADDING_CHAR_NONE} if not).
   */
  final private var _paddingChar: Char = 0
  /**
   * Maximum number of encoded base64 characters to output during encoding
   * before adding a linefeed, if line length is to be limited
   * ({@link Integer# MAX_VALUE} if not limited).
   * <p>
   * Note: for some output modes (when writing attributes) linefeeds may
   * need to be avoided, and this value ignored.
   */
  final private var _maxLineLength = 0
  def this(name: String, base64Alphabet: String, usesPadding: Boolean, paddingChar: Char, maxLineLength: Int) {
    this()
    _name = name
    _usesPadding = usesPadding
    _paddingChar = paddingChar
    _maxLineLength = maxLineLength
    // Ok and then we need to create codec tables.
    // First the main encoding table:
    val alphaLen = base64Alphabet.length
    if (alphaLen != 64) throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + alphaLen + ")")
    // And then secondary encoding table and decoding table:
    base64Alphabet.getChars(0, alphaLen, _base64ToAsciiC, 0)
    util.Arrays.fill(_asciiToBase64, Base64Variant.BASE64_VALUE_INVALID)
    for (i <- 0 until alphaLen) {
      val alpha = _base64ToAsciiC(i)
      _base64ToAsciiB(i) = alpha.toByte
      _asciiToBase64(alpha) = i
    }
    // Plus if we use padding, add that in too
    if (usesPadding) _asciiToBase64(paddingChar.toInt) = Base64Variant.BASE64_VALUE_PADDING
  }
  /**
   * "Copy constructor" that can be used when the base alphabet is identical
   * to one used by another variant, but other details (padding, maximum
   * line length) differ
   */
  def this(base: Base64Variant, name: String, usesPadding: Boolean, paddingChar: Char, maxLineLength: Int) {
    this()
    _name = name
    val srcB = base._base64ToAsciiB
    System.arraycopy(srcB, 0, this._base64ToAsciiB, 0, srcB.length)
    val srcC = base._base64ToAsciiC
    System.arraycopy(srcC, 0, this._base64ToAsciiC, 0, srcC.length)
    val srcV = base._asciiToBase64
    System.arraycopy(srcV, 0, this._asciiToBase64, 0, srcV.length)
    _usesPadding = usesPadding
    _paddingChar = paddingChar
    _maxLineLength = maxLineLength
  }
  /**
   * "Copy constructor" that can be used when the base alphabet is identical
   * to one used by another variant except for the maximum line length
   * (and obviously, name).
   */
  def this(base: Base64Variant, name: String, maxLineLength: Int) {
    this(base, name, base._usesPadding, base._paddingChar, maxLineLength)
  }
  def getName = _name
  def usesPadding = _usesPadding
  def usesPaddingChar(c: Char) = c == _paddingChar
  def usesPaddingChar(ch: Int) = ch == _paddingChar.toInt
  def getPaddingChar = _paddingChar
  def getPaddingByte = _paddingChar.toByte
  def getMaxLineLength = _maxLineLength
  /**
   * @return 6-bit decoded value, if valid character;
   */
  def decodeBase64Char(c: Char) = {
    val ch = c.toInt
    if (ch <= 127) _asciiToBase64(ch)
    else Base64Variant.BASE64_VALUE_INVALID
  }
  def encodeBase64Chunk(sb: StringBuilder, b24: Int): Unit = {
    sb.append(_base64ToAsciiC((b24 >> 18) & 0x3F))
    sb.append(_base64ToAsciiC((b24 >> 12) & 0x3F))
    sb.append(_base64ToAsciiC((b24 >> 6) & 0x3F))
    sb.append(_base64ToAsciiC(b24 & 0x3F))
  }
  def encodeBase64Partial(sb: StringBuilder, bits: Int, outputBytes: Int): Unit = {
    sb.append(_base64ToAsciiC((bits >> 18) & 0x3F))
    sb.append(_base64ToAsciiC((bits >> 12) & 0x3F))
    if (_usesPadding) {
      sb.append(if (outputBytes == 2) _base64ToAsciiC((bits >> 6) & 0x3F)
      else _paddingChar)
      sb.append(_paddingChar)
    }
    else if (outputBytes == 2) sb.append(_base64ToAsciiC((bits >> 6) & 0x3F))
  }
  /**
   * Convenience method for converting given byte array as base64 encoded
   * String using this variant's settings.
   * Resulting value is "raw", that is, not enclosed in double-quotes.
   *
   * @param input Byte array to encode
   */
  def encode(input: Array[Byte]): String = encode(input, false)
  /**
   * Convenience method for converting given byte array as base64 encoded String
   * using this variant's settings,
   * optionally enclosed in double-quotes.
   *
   * @param input     Byte array to encode
   * @param addQuotes Whether to surround resulting value in double quotes or not
   */
  def encode(input: Array[Byte], addQuotes: Boolean) = {
    val inputEnd = input.length
    var sb: StringBuilder = null
    // let's approximate... 33% overhead, ~= 3/8 (0.375)
    val outputLen = inputEnd + (inputEnd >> 2) + (inputEnd >> 3)
    sb = new StringBuilder(outputLen)

    if (addQuotes) sb.append('"')
    var chunksBeforeLF = getMaxLineLength >> 2
    // Ok, first we loop through all full triplets of data:
    var inputPtr = 0
    val safeInputEnd = inputEnd - 3 // to get only full triplets
    while ( {
      inputPtr <= safeInputEnd
    }) { // First, mash 3 bytes into lsb of 32-bit int
      var b24 = input({
        inputPtr += 1; inputPtr - 1
      }).toInt << 8
      b24 |= input({
        inputPtr += 1; inputPtr - 1
      }).toInt & 0xFF
      b24 = (b24 << 8) | (input({
        inputPtr += 1; inputPtr - 1
      }).toInt & 0xFF)
      encodeBase64Chunk(sb, b24)
      if ( {
        chunksBeforeLF -= 1; chunksBeforeLF
      } <= 0) { // note: must quote in JSON value, so not really useful...
        sb.append('\\')
        sb.append('n')
        chunksBeforeLF = getMaxLineLength >> 2
      }
    }
    // And then we may have 1 or 2 leftover bytes to encode
    val inputLeft = inputEnd - inputPtr // 0, 1 or 2
    if (inputLeft > 0) { // yes, but do we have room for output?
      var b24 = input({
        inputPtr += 1; inputPtr - 1
      }).toInt << 16
      if (inputLeft == 2) b24 |= (input({
        inputPtr += 1; inputPtr - 1
      }).toInt & 0xFF) << 8
      encodeBase64Partial(sb, b24, inputLeft)
    }
    if (addQuotes) sb.append('"')
    sb.toString
  }
  /**
   * Convenience method for decoding contents of a Base64-encoded String,
   * using this variant's settings.
   *
   * @param input
   * @since 2.2.3
   * @throws IllegalArgumentException if input is not valid base64 encoded data
   */
  @SuppressWarnings(Array("resource"))
  @throws[IllegalArgumentException]
  def decode(input: String): Array[Byte] = {
    val b = new ByteArrayBuilder
    decode(input, b)
    b.toByteArray
  }
  /**
   * Convenience method for decoding contents of a Base64-encoded String,
   * using this variant's settings
   * and appending decoded binary data using provided {@link ByteArrayBuilder}.
   * <p>
   * NOTE: builder will NOT be reset before decoding (nor cleared afterwards);
   * assumption is that caller will ensure it is given in proper state, and
   * used as appropriate afterwards.
   *
   * @since 2.3
   * @throws IllegalArgumentException if input is not valid base64 encoded data
   */
  @throws[IllegalArgumentException]
  def decode(str: String, builder: ByteArrayBuilder): Unit = {
    var ptr = 0
    val len = str.length
    breakable {
      while ( {
        true
      }) { // first, we'll skip preceding white space, if any
        var ch: Char = 0
        var main_loop = false
        breakable {
          do {
            if (ptr >= len) {
              main_loop = true
              break //todo: break is not supported

            }
            ch = str.charAt({
              ptr += 1;
              ptr - 1
            })
          } while ( {
            ch <= Base64Variant.INT_SPACE
          })
        }
        if (main_loop) break //todo: break is not supported
        var bits = decodeBase64Char(ch)
        if (bits < 0) _reportInvalidBase64(ch, 0, null)
        var decodedData = bits
        // then second base64 char; can't get padding yet, nor ws
        if (ptr >= len) _reportBase64EOF()
        ch = str.charAt({
          ptr += 1; ptr - 1
        })
        bits = decodeBase64Char(ch)
        if (bits < 0) _reportInvalidBase64(ch, 1, null)
        decodedData = (decodedData << 6) | bits
        // third base64 char; can be padding, but not ws
        if (ptr >= len) { // but as per [JACKSON-631] can be end-of-input, iff not using padding
          if (!usesPadding) {
            decodedData >>= 4
            builder.append(decodedData)
            break //todo: break is not supported

          }
          _reportBase64EOF()
        }
        ch = str.charAt({
          ptr += 1; ptr - 1
        })
        bits = decodeBase64Char(ch)
        // First branch: can get padding (-> 1 byte)
        if (bits < 0) {
          if (bits != Base64Variant.BASE64_VALUE_PADDING) _reportInvalidBase64(ch, 2, null)
          // Ok, must get padding
          if (ptr >= len) _reportBase64EOF()
          ch = str.charAt({
            ptr += 1; ptr - 1
          })
          if (!usesPaddingChar(ch)) _reportInvalidBase64(ch, 3, "expected padding character '" + getPaddingChar + "'")
          // Got 12 bits, only need 8, need to shift
          decodedData >>= 4
          builder.append(decodedData)
        }
        else { // Nope, 2 or 3 bytes
          decodedData = (decodedData << 6) | bits
          // fourth and last base64 char; can be padding, but not ws
          if (ptr >= len) {
            if (!usesPadding) {
              decodedData >>= 2
              builder.appendTwoBytes(decodedData)
              break //todo: break is not supported

            }
            _reportBase64EOF()
          }
          ch = str.charAt({
            ptr += 1; ptr - 1
          })
          bits = decodeBase64Char(ch)
          if (bits < 0) {
            if (bits != Base64Variant.BASE64_VALUE_PADDING) _reportInvalidBase64(ch, 3, null)
            decodedData >>= 2
            builder.appendTwoBytes(decodedData)
          }
          else { // otherwise, our triple is now complete
            decodedData = (decodedData << 6) | bits
            builder.appendThreeBytes(decodedData)
          }
        }
      }
    }
  }
  override def toString = _name
  override def equals(o: Any) = { // identity comparison should be dine
    o == this
  }
  override def hashCode = _name.hashCode
  /**
   * @param bindex Relative index within base64 character unit; between 0
   *               and 3 (as unit has exactly 4 characters)
   */
  @throws[IllegalArgumentException]
  protected def _reportInvalidBase64(ch: Char, bindex: Int, msg: String): Unit = {
    var base: String = null
    if (ch <= Base64Variant.INT_SPACE) base = "Illegal white space character (code 0x" + Integer.toHexString(ch) + ") as character #" + (bindex + 1) + " of 4-char base64 unit: can only used between units"
    else if (usesPaddingChar(ch)) base = "Unexpected padding character ('" + getPaddingChar + "') as character #" + (bindex + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character"
    else if (!Character.isDefined(ch) || Character.isISOControl(ch)) { // Not sure if we can really get here... ? (most illegal xml chars are caught at lower level)
      base = "Illegal character (code 0x" + Integer.toHexString(ch) + ") in base64 content"
    }
    else base = "Illegal character '" + ch + "' (code 0x" + Integer.toHexString(ch) + ") in base64 content"
    if (msg != null) base = base + ": " + msg
    throw new IllegalArgumentException(base)
  }
  @throws[IllegalArgumentException]
  protected def _reportBase64EOF(): Unit = {
    throw new IllegalArgumentException(missingPaddingMessage)
  }
  /**
   * Helper method that will construct a message to use in exceptions for cases where input ends
   * prematurely in place where padding would be expected.
   *
   * @since 2.10
   */
  def missingPaddingMessage = String.format("Unexpected end of base64-encoded String: base64 variant '%s' expects padding (one or more '%c' characters) at the end", getName, getPaddingChar)
}

