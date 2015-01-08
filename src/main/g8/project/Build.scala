import sbt._
import sbt.Keys._
import rugds.sbt._

object ScalaBuild extends Build {
  lazy val $name;format="start,decap,word"$Main = mainProject
    .aggregate($name;format="start,decap,word"$Project)

  lazy val $name;format="start,decap,word"$Project = defineProject(scalaProject, "$name$") settings (
    
  )
}