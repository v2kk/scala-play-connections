package controllers

import javax.inject.Inject

import play.api.libs.json.Json
import play.api.mvc.{AbstractController, ControllerComponents}
import services.{BlockingService, StaticService}

import scala.concurrent.ExecutionContext.Implicits.global

/**
  * Created by vinhdp on 11/11/17.
  */
class StaticController @Inject()(component: ControllerComponents, staticService: StaticService, blockingService: BlockingService)
    extends AbstractController(component) with CommonFeature {


    def getAsyncSeq() = Action.async {
        staticService.getSequenceAsync().map(seqs =>
            Ok(Json.toJson(seqs))
        )
    }

    def getSyncSeq() = Action {
        Ok(Json.toJson(staticService.getSequenceSync()))
    }

    def getAsyncSeqWithBlocking() = Action.async {
        staticService.getSequenceAsyncWithBlocking().map(seqs =>
            Ok(Json.toJson(seqs))
        )
    }

    def send(key: String) = Action.async {
        blockingService.send(key).map(r => {
            Ok(envelopedJson(200, Json.toJson(r)))
        })
    }

    def sendSync(key: String) = Action.async {
        blockingService.send(key).map(r => {
            Ok(envelopedJson(200, Json.toJson(r)))
        })
    }
}
