
name := "scout-scala"

version := "0.1"

scalaVersion := "2.13.5"

Compile / PB.targets := Seq(
  scalapb.gen(grpc=false) -> (Compile / sourceManaged).value / "scalapb"
)

enablePlugins(ScalaJSPlugin)
scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion % "protobuf",
//  "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion % "protobuf",
)
