
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/ftel/play-concurrent-connections/conf/routes
// @DATE:Sun Nov 12 13:06:47 ICT 2017


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
