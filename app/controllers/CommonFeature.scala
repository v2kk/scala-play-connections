package controllers

import play.api.libs.json.{JsValue, Json}

/**
  * Created by vinhdp on 10/17/17.
  */
trait CommonFeature {

    def envelopedJson(status: Int, json: JsValue): JsValue = Json.obj(
        "data" -> json,
        "code" -> status
    )

    def cateToScale(cate: String): String = {
        //var scale = "w=300&h=430"
        var scale = "w=300"
        if(Seq("tvshow", "the-thao", "general", "ngoai-hang-anh", "directvina-vod").contains(cate)) {
            //scale = "w=400&h=225"
            scale = "w=400"
        }

        scale
    }
}
