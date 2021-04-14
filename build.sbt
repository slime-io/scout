name := "scout-scala"
version := "0.1"
scalaVersion := "2.13.5"

enablePlugins(ScalaJSPlugin, ScalaJSBundlerPlugin)

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "com.github.scopt"     %%% "scopt"              % "4.0.1",
  "com.thesamet.scalapb" %%% "scalapb-runtime"    % "0.10.10",
  "com.thesamet.scalapb" %%% "scalapb-runtime"    % "0.10.10"  % "protobuf",
  "io.github.cquiroz"    %%% "scala-java-locales" % "1.1.2",
  "org.json4s"           %%% "json4s-native-core" % "3.7.0-M15",
  "org.scala-js"         %%% "scalajs-dom"        % "1.1.0",
  "be.doeraene"          %%% "scalajs-jquery"     % "1.0.0",
  "com.chuusai" %%% "shapeless" % "2.4.0-M1"
)
npmDependencies in Compile ++= Seq(
  "jquery" -> "2.2.1",
  "d3" -> "3.5.17"
)
webpackBundlingMode in fastOptJS := BundlingMode.LibraryOnly()