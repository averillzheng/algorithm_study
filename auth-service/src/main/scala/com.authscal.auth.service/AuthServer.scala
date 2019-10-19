package com.authscal.auth.service
import akka.http.scaladsl.server.{HttpApp, Route}

object AuthServer extends HttpApp {
  override protected def routes: Route = {
    path("") {
      get {
        complete("hello")
      }
    }
  }

  def main(args: Array[String]): Unit = {
    AuthServer.startServer("localhost", 8080)
  }
}
