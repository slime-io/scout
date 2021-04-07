
name := "scout-scala"

version := "0.1"

scalaVersion := "2.13.5"

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true
enablePlugins(JSDependenciesPlugin)
//import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}
//crossProject(JSPlatform, JVMPlatform).crossType(CrossType.Pure) in file("proto")

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
//  PB.gens.java -> (Compile / sourceManaged).value
)

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %%% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion,
  "com.thesamet.scalapb" %%% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
  "io.github.cquiroz" %%% "scala-java-locales" % "1.1.2",
  "org.json4s" %%% "json4s-native-core" % "3.7.0-M15",
  "org.scala-js" %%% "scalajs-dom" % "1.1.0",
//  "be.doeraene" %%% "scalajs-jquery" % "1.0.0"
"org.querki" %%% "jquery-facade" % "2.0"
//  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
//  "com.thesamet.scalapb" %% "scalapb-json4s" % "0.10.1",
//  "io.circe" %% "circe-core" % "0.13.0",
//  "io.circe" %% "circe-parser" % "0.13.0",
)
val circeVersion = "0.13.0"

libraryDependencies ++= Seq(
  "io.circe" %%% "circe-core",
  "io.circe" %%% "circe-generic",
  "io.circe" %%% "circe-parser"
).map(_ % circeVersion)

jsDependencies += "org.webjars" % "jquery" % "2.2.1" / "jquery.js" minified "jquery.min.js"
skip in packageJSDependencies := false
