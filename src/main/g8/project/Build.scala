import sbt._
import sbt.Keys._
import rugds.sbt._

object ScalaBuild extends Build {
  lazy val $name$Main = mainProject
    .aggregate($name$Project)

  lazy val $name$Project = defineProject(scalaProject, "$name$") settings (
    
  )
}