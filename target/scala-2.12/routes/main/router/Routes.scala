
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/vinhdp/workspaces/ftel/play-concurrent-connections/conf/routes
// @DATE:Sun Nov 12 13:06:47 ICT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  StaticController_0: controllers.StaticController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    StaticController_0: controllers.StaticController
  ) = this(errorHandler, StaticController_0, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, StaticController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """static/async""", """controllers.StaticController.getAsyncSeq()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """static/sync""", """controllers.StaticController.getSyncSeq()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """static/async-blocking""", """controllers.StaticController.getAsyncSeqWithBlocking()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """static/send""", """controllers.StaticController.send(key:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """static/send-sync""", """controllers.StaticController.sendSync(key:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_StaticController_getAsyncSeq0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("static/async")))
  )
  private[this] lazy val controllers_StaticController_getAsyncSeq0_invoker = createInvoker(
    StaticController_0.getAsyncSeq(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StaticController",
      "getAsyncSeq",
      Nil,
      "GET",
      this.prefix + """static/async""",
      """""",
      Seq()
    )
  )

  // @LINE:2
  private[this] lazy val controllers_StaticController_getSyncSeq1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("static/sync")))
  )
  private[this] lazy val controllers_StaticController_getSyncSeq1_invoker = createInvoker(
    StaticController_0.getSyncSeq(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StaticController",
      "getSyncSeq",
      Nil,
      "GET",
      this.prefix + """static/sync""",
      """""",
      Seq()
    )
  )

  // @LINE:3
  private[this] lazy val controllers_StaticController_getAsyncSeqWithBlocking2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("static/async-blocking")))
  )
  private[this] lazy val controllers_StaticController_getAsyncSeqWithBlocking2_invoker = createInvoker(
    StaticController_0.getAsyncSeqWithBlocking(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StaticController",
      "getAsyncSeqWithBlocking",
      Nil,
      "GET",
      this.prefix + """static/async-blocking""",
      """""",
      Seq()
    )
  )

  // @LINE:5
  private[this] lazy val controllers_StaticController_send3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("static/send")))
  )
  private[this] lazy val controllers_StaticController_send3_invoker = createInvoker(
    StaticController_0.send(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StaticController",
      "send",
      Seq(classOf[String]),
      "GET",
      this.prefix + """static/send""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_StaticController_sendSync4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("static/send-sync")))
  )
  private[this] lazy val controllers_StaticController_sendSync4_invoker = createInvoker(
    StaticController_0.sendSync(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.StaticController",
      "sendSync",
      Seq(classOf[String]),
      "GET",
      this.prefix + """static/send-sync""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_StaticController_getAsyncSeq0_route(params) =>
      call { 
        controllers_StaticController_getAsyncSeq0_invoker.call(StaticController_0.getAsyncSeq())
      }
  
    // @LINE:2
    case controllers_StaticController_getSyncSeq1_route(params) =>
      call { 
        controllers_StaticController_getSyncSeq1_invoker.call(StaticController_0.getSyncSeq())
      }
  
    // @LINE:3
    case controllers_StaticController_getAsyncSeqWithBlocking2_route(params) =>
      call { 
        controllers_StaticController_getAsyncSeqWithBlocking2_invoker.call(StaticController_0.getAsyncSeqWithBlocking())
      }
  
    // @LINE:5
    case controllers_StaticController_send3_route(params) =>
      call(params.fromQuery[String]("key", None)) { (key) =>
        controllers_StaticController_send3_invoker.call(StaticController_0.send(key))
      }
  
    // @LINE:6
    case controllers_StaticController_sendSync4_route(params) =>
      call(params.fromQuery[String]("key", None)) { (key) =>
        controllers_StaticController_sendSync4_invoker.call(StaticController_0.sendSync(key))
      }
  }
}
