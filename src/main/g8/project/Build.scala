import sbt._
import sbt.Keys._
import rugds.sbt._

object ScalaBuild extends Build {
  lazy val $name;format="start"$Main = mainProject
    .aggregate($name;format="start,decap"$Project)

  lazy val $name;format="start"$Project = defineProject(scalaProject, "$name$") settings (
    
  )
}