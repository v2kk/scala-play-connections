
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/ftel/play-concurrent-connections/conf/routes
// @DATE:Sun Nov 12 13:06:47 ICT 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers {

  // @LINE:1
  class ReverseStaticController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def send(key:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "static/send" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("key", key)))))
    }
  
    // @LINE:1
    def getAsyncSeq(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "static/async")
    }
  
    // @LINE:3
    def getAsyncSeqWithBlocking(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "static/async-blocking")
    }
  
    // @LINE:2
    def getSyncSeq(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "static/sync")
    }
  
    // @LINE:6
    def sendSync(key:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "static/send-sync" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("key", key)))))
    }
  
  }


}
