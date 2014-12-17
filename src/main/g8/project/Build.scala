import sbt._
import sbt.Keys._
import rugds.sbt._

object ScalaBuild extends Build {
  val $name$Main = mainProject
    .aggregate($name$Project)

  val $name$Project = defineProject(scalaProject, "$name$") settings (
    
  )
}