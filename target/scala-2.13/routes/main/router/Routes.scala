// @GENERATOR:play-routes-compiler
// @SOURCE:/home/leon/projects/meerkat/meerkat-play/conf/routes
// @DATE:Thu Mar 04 14:55:07 CET 2021

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  meerkat_MeerkatRouter_0: meerkat.MeerkatRouter,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    meerkat_MeerkatRouter_0: meerkat.MeerkatRouter
  ) = this(errorHandler, meerkat_MeerkatRouter_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, meerkat_MeerkatRouter_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    prefixed_meerkat_MeerkatRouter_0_0.router.documentation,
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] val prefixed_meerkat_MeerkatRouter_0_0 = Include(meerkat_MeerkatRouter_0.withPrefix(this.prefix + (if (this.prefix.endsWith("/")) "" else "/") + ""))


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case prefixed_meerkat_MeerkatRouter_0_0(handler) => handler
  }
}
