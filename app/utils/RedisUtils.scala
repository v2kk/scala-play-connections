package utils

import java.security.MessageDigest
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.Locale

import scala.collection.BitSet

/**
  * Created by vinhdp on 9/25/17.
  */
object RedisUtils {

    object Screen {
        val HOME = "h"
        val DETAIL = "d"
    }

    object Keys {
        val DEVICE = "d"
        val USER = "u"
        val ITEM = "i"
        val ITEMS = "items"
        val LOCATION = "l"
        val PLATFORM = "p"
    }

    val FPLAY_ITEM_RECOMMENDATION_PREFIX = "fp:r1:it"
    val FPLAY_TV_RECOMMENDATION_PREFIX = "fp:r1:tv"
    val FPLAY_STATS_PREFIX = "fp:stats"

    def getRedisHashKey(seq: String*): String = {
        val original = seq.mkString(":")
        val md = MessageDigest.getInstance("sha-1")
        val sha1 = md.digest(original.getBytes)
        val stringBuilder = new StringBuilder

        for (aByte <- sha1) {
            stringBuilder.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1))
        }

        stringBuilder.toString
    }

    def getRedisKey(seq: String*): String = {
        seq.mkString(":")
    }

    def fromByteArrayReverse(bytes: Array[Byte]) = {
        var bits = BitSet()
        for (i <- 0 until bytes.length * 8) {
            if ((bytes(i / 8) & (1 << (7 - (i % 8)))) != 0) {
                bits += i
            }
        }

        bits
    }

    def getTimeKey(datetime: LocalDateTime, pattern: String): String = {
        datetime.format(DateTimeFormatter.ofPattern(pattern, Locale.UK))
    }

    def getStatKeys(datetime: LocalDateTime, cate: String): Seq[String] = {

        // get week key
        val seq1: Seq[String] = Seq(0, 1, 2, 3).map{ i =>
            val key = getTimeKey(datetime.minusDays(i * 7), "yyyyww")
            getRedisKey(FPLAY_STATS_PREFIX, cate, key)
        }

        // get day key
        val start = datetime.getDayOfWeek.getValue
        val seq2: Seq[String] = (start until 7).map { i =>
            val key = getTimeKey(datetime.minusDays(28 - (7 - i)), "yyyyMMdd")
            getRedisKey(FPLAY_STATS_PREFIX, cate, key)
        }

        seq1 ++ seq2
    }

    def main(args: Array[String]): Unit = {

        val currentTime = LocalDateTime.of(2017, 11, 6, 0, 0)
        val seq = getStatKeys(currentTime, "tv")
        seq.map(r => println(r))
    }
}
