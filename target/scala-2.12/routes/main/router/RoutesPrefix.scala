
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/fpt/play-concurrent-connections/conf/routes
// @DATE:Sat Nov 11 21:09:53 ICT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
