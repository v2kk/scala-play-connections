name := "play-concurrent-connections"

version := "1.0"

scalaVersion := "2.12.4"

packageName in Universal := s"${name.value}"

lazy val root = (project in file("."))
//    .enablePlugins(PlayScala, PlayNettyServer)
//    .disablePlugins(PlayAkkaHttpServer)
    .enablePlugins(PlayScala)
PlayKeys.devSettings := Seq("play.server.http.port" -> "9001")

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += evolutions
libraryDependencies += guice
libraryDependencies += ehcache
libraryDependencies += ws
libraryDependencies ++= Seq(
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.1" % Test,
    "com.typesafe.play" %% "play-slick" % "3.0.0",
    "com.typesafe.play" %% "play-slick-evolutions" % "3.0.0",
    "org.postgresql" % "postgresql" % "42.1.1",
    "org.slf4j" % "slf4j-nop" % "1.7.25",
    "com.pauldijou" %% "jwt-play-json" % "0.14.0",
    "com.typesafe" % "config" % "1.3.0",
    "net.debasishg" %% "redisclient" % "3.4"
)
