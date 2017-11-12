package services

import scala.concurrent.Future
import scala.concurrent.blocking
import scala.concurrent.ExecutionContext.Implicits.global
//import utils.Contexts.blockingContext

/**
  * Created by vinhdp on 11/11/17.
  */
trait StaticService {

    def getSequenceSync(): Seq[String]
    def getSequenceAsync(): Future[Seq[String]]
    def getSequenceAsyncWithBlocking(): Future[Seq[String]]
}

class StaticServiceImpl extends StaticService {

    val sequence = Seq(
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2",
        "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2", "cfbcca4b31f37bcb5569ed2df53fe4e9f1bba0e2"
    )

    def getSequenceSync(): Seq[String] = {
        sequence
    }

    def getSequenceAsync(): Future[Seq[String]] = Future {
        sequence
    }

    def getSequenceAsyncWithBlocking(): Future[Seq[String]] = Future {
        blocking {
            sequence
        }
    }
}
