
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/fpt/play-concurrent-connections/conf/routes
// @DATE:Sat Nov 11 21:09:53 ICT 2017

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseStaticController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:3
    def getAsyncSeqWithBlocking: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticController.getAsyncSeqWithBlocking",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/async-blocking"})
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
  
    // @LINE:2
    def getSyncSeq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.StaticController.getSyncSeq",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "static/sync"})
        }
      """
    )
  
  }


}
