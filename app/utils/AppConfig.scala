package utils

import com.typesafe.config.ConfigFactory

/**
  * Created by vinhdp on 6/21/17.
  */
object AppConfig {

    val appConfig = ConfigFactory.load

    object Inf {
        val NUMBER_OF_ERROR = appConfig.getInt("api.infra.contract.error.nError")
    }

    object RedisServer {

        val DB01_HOST = appConfig.getString(s"redis.db01.host")
        val DB01_PORT = appConfig.getInt(s"redis.db01.port")
        val DB02_HOST = appConfig.getString(s"redis.db02.host")
        val DB02_PORT = appConfig.getInt(s"redis.db02.port")
        val CACHE01_HOST = appConfig.getString(s"redis.cache01.host")
        val CACHE01_PORT = appConfig.getInt(s"redis.cache01.port")
        val STATS01_HOST = appConfig.getString(s"redis.stats01.host")
        val STATS01_PORT = appConfig.getInt(s"redis.stats01.port")
    }

    object Default {
        val FUTURE_TIMEOUT = appConfig.getInt(s"api.timeout")
        val LOCAL_CACHE_TIMEOUT = appConfig.getInt(s"api.local.timeout")
        val NUM_DEFAULT_ITEM = appConfig.getInt(s"api.num_item")
        val NUM_DEFAULT_CHANNEL = appConfig.getInt(s"api.num_channel")

    }
}
