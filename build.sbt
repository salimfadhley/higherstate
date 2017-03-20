name := "higherstate"

version := "1.0"

scalaVersion := "2.12.1"


val http4sVersion = "0.15.7"
val scalatestVersion = "3.0.1"
val circeVersion = "0.7.0"

val main = "server.Main"

libraryDependencies ++= Seq(

  "org.slf4j" % "slf4j-simple" % "1.6.4",

  "org.scalactic" %% "scalactic" % scalatestVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion % "test",

  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "io.circe" %% "circe-literal" % circeVersion,

  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion

)