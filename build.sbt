name := "higherstate"

version := "1.0"

scalaVersion := "2.12.1"


val scalatestVersion = "3.0.1"
val circeVersion = "0.6.1"

val main = "simulation.Main"



libraryDependencies ++= Seq(

  "org.slf4j" % "slf4j-simple" % "1.6.4",

  "org.scalactic" %% "scalactic" % scalatestVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion % "test",

  "org.http4s" %% "http4s-circe" % "0.15.7",
  "io.circe" %% "circe-generic" % "0.6.1",
  "io.circe" %% "circe-literal" % "0.6.1"
)