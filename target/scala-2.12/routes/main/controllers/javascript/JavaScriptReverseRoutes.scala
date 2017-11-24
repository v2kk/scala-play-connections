
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/ftel/play-concurrent-connections/conf/routes
// @DATE:Sun Nov 12 13:06:47 ICT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseStaticController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def send: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticController.send",
      """
        function(key0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/send" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("key", key0)])})
        }
      """
    )
  
    // @LINE:1
    def getAsyncSeq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticController.getAsyncSeq",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/async"})
        }
      """
    )
  
    // @LINE:3
    def getAsyncSeqWithBlocking: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticController.getAsyncSeqWithBlocking",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/async-blocking"})
        }
      """
    )
  
    // @LINE:2
    def getSyncSeq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticController.getSyncSeq",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/sync"})
        }
      """
    )
  
    // @LINE:6
    def sendSync: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticController.sendSync",
      """
        function(key0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/send-sync" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("key", key0)])})
        }
      """
    )
  
  }


}
