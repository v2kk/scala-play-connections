package services

import com.redis.RedisClientPool
import org.apache.commons.pool.impl.GenericObjectPool
import utils.AppConfig.RedisServer
import utils.RedisUtils

import scala.concurrent.{Future}
import utils.Contexts.blockingContext

/**
  * Created by vinhdp on 11/11/17.
  */
trait BlockingService {

    def send(key: String): Future[Seq[String]]
    def sendSync(key: String): Seq[String]
}

class BlockingServiceImpl extends BlockingService {
    val dataHost = new RedisClientPool(RedisServer.DB02_HOST, RedisServer.DB02_PORT, maxIdle = 1000, database = 0, timeout = 3000,
        whenExhaustedBehavior = GenericObjectPool.WHEN_EXHAUSTED_GROW)
    private val tvPrefix = RedisUtils.FPLAY_TV_RECOMMENDATION_PREFIX

    def send(key: String): Future[Seq[String]] = Future {
        dataHost.withClient {
            client => {
                val channels = client.lrange(key, 0, -1) match {
                    case Some(data) => {
                        data match {
                            case Nil => Nil
                            case lst => {
                                lst.flatten
                            }
                        }
                    }
                }
                channels
            }
        }
    }

    def sendSync(key: String): Seq[String] = {

        dataHost.withClient {
            client => {
                val channels = client.lrange(key, 0, -1) match {
                    case Some(data) => {
                        data match {
                            case Nil => Nil
                            case lst => {
                                lst.flatten
                            }
                        }
                    }
                }
                channels
            }
        }
    }
}