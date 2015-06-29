name := "helloworld"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := Option(System.getProperty("scala.version")).getOrElse("2.11.7")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.5" % "test",
  "org.scalactic" %% "scalactic" % "2.2.5" % "test",
  "org.scalatestplus" %% "play" % "1.2.0" % "test")
