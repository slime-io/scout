package scalapb.json4s

import com.google.protobuf.timestamp.Timestamp

import java.util.Date

object Timestamps {
  class ParseException(str: String) extends RuntimeException
  // Timestamp for "0001-01-01T00:00:00Z"
  val TIMESTAMP_SECONDS_MIN = -62135596800L
  val TIMESTAMP_SECONDS_MAX = 253402300799L
  val MILLIS_PER_SECOND = 1000
  val MICROS_PER_SECOND = 1000000
  val NANOS_PER_SECOND = 1000000000
  val NANOS_PER_MILLISECOND = 1000000
  val NANOS_PER_MICROSECOND = 1000

  def isValid(ts: Timestamp): Boolean =
    (ts.seconds >= TIMESTAMP_SECONDS_MIN &&
      ts.seconds <= TIMESTAMP_SECONDS_MAX &&
      ts.nanos >= 0 &&
      ts.nanos < NANOS_PER_SECOND)

  def checkValid(ts: Timestamp): Timestamp = {
    require(isValid(ts), "Timestamp is not valid.")
    ts
  }

  def formatNanos(nanos: Int): String = {
    // Determine whether to use 3, 6, or 9 digits for the nano part.
    if (nanos % NANOS_PER_MILLISECOND == 0) {
      "%1$03d".format(nanos / NANOS_PER_MILLISECOND)
    } else if (nanos % NANOS_PER_MICROSECOND == 0) {
      "%1$06d".format(nanos / NANOS_PER_MICROSECOND)
    } else {
      "%1$09d".format(nanos)
    }
  }

  def writeTimestamp(ts: Timestamp): String = {
    checkValid(ts)

    val result = new StringBuilder
    val date = new Date(ts.seconds * Timestamps.MILLIS_PER_SECOND)
    result.append(f"${date.getYear+1900}%d-${date.getMonth+1}%02d-${date.getDate}%02dT${date.getHours}%02d:${date.getMinutes}%02d:${date.getSeconds}%02d")
    if (ts.nanos != 0) {
      result.append(".")
      result.append(formatNanos(ts.nanos))
    }
    result.append("Z")
    result.toString
  }

  def parseTimezoneOffset(s: String): Long = s(0) match {
    case 'Z' =>
      if (s.length != 1) {
        throw new ParseException(
          s"Failed to parse timestamp: invalid trailing data: '$s'"
        )
      } else {
        0
      }
    case '+' | '-' =>
      val pos = s.indexOf(':')
      if (pos == -1) {
        throw new ParseException(
          s"Failed to parse timestamp: invalid offset value: '$s'"
        )
      } else {
        val hours = s.substring(1, pos)
        val minutes = s.substring(pos + 1)
        val r = hours.toLong * 3600 + minutes.toLong * 60
        if (s(0) == '-') -r else r
      }
    case _ => throw new ParseException("Failed to parse timestamp.")
  }

  def parseTimestamp(value: String): Timestamp = {
    val dayOffset = value.indexOf('T')
    if (dayOffset == -1) {
      throw new ParseException("Failed to parse timestamp.")
    }
    val timezoneOffsetPosition = {
      val zIndex = value.indexOf('Z', dayOffset)
      if (zIndex != -1) zIndex
      else {
        val pIndex = value.indexOf('+', dayOffset)
        if (pIndex != -1) pIndex
        else {
          val mIndex = value.indexOf('-', dayOffset)
          if (mIndex != -1) mIndex
          else {
            throw new ParseException(
              "Failed to parse timestamp: missing valid timezone offset."
            )
          }
        }
      }
    }
    val timezoneOffset = parseTimezoneOffset(
      value.substring(timezoneOffsetPosition)
    )

    val timeValue = value.substring(0, timezoneOffsetPosition)
    val pointPosition = timeValue.indexOf('.')
    val (secondValue, nanoValue) =
      if (pointPosition == -1)
        (timeValue, "")
      else
        (
          timeValue.substring(0, pointPosition),
          timeValue.substring(pointPosition + 1)
        )
    val date = {
      val Array(ymd, hms) = secondValue.split("T")
      val Array(y, mth, d) = ymd.split("-").map(_.toInt)
      val Array(h, m, s) = hms.split(":").map(_.toInt)
      new java.util.Date(y-1900, mth-1, d, h, m, s)
    }
    val seconds: Long = date.getTime / MILLIS_PER_SECOND - timezoneOffset
    val nanos: Int =
      if (nanoValue.isEmpty) 0 else Durations.parseNanos(nanoValue)
    normalizedTimestamp(seconds, nanos)
  }

  def normalizedTimestamp(seconds: Long, nanos: Int): Timestamp = {
    val (ns, nn) =
      if (nanos <= -NANOS_PER_SECOND || nanos >= NANOS_PER_SECOND) {
        (seconds + nanos / NANOS_PER_SECOND, nanos % NANOS_PER_SECOND)
      } else (seconds, nanos)

    val (ns2, nn2) =
      if (nn < 0) (seconds - 1, nanos + NANOS_PER_SECOND)
      else (ns, nn)

    checkValid(Timestamp(seconds = ns2, nanos = nn2))
  }
}
