package utils

import akka.actor.ActorSystem

import scala.concurrent.ExecutionContext

/**
  * Created by vinhdp on 10/8/17.
  */
object Contexts {

    implicit val redisContext: ExecutionContext = ActorSystem("application").dispatchers.lookup("akka.actor.redis-context")
    //implicit val threadPoolContext: ExecutionContext = ActorSystem("application").dispatchers.lookup("akka.actor.thread-pool-context")
    implicit val blockingContext: ExecutionContext = ActorSystem("application").dispatchers.lookup("akka.actor.blocking-context")
}
