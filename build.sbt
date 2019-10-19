ThisBuild / organization :="com.authscal"
ThisBuild / scalaVersion := "2.12.10"
ThisBuild / version      := "0.1.0-SNAPSHOT"

lazy val `auth-service` = project in file("auth-service")
lazy val `auth-lib` = project in file("auth-lib")