import sbt._
import sbt.Keys._
import rugds.sbt._

object ScalaBuild extends Build {
  lazy val $name;format="camel"$Main = mainProject
    .aggregate($name;format="camel"$Project)

  lazy val $name;format="camel"$Project = defineProject(scalaProject, "$name$") settings (
    mainClass in Compile := Some("$organization$.$name;format="word-only"$.$name$")
  )
}