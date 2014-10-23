import sbt._
import sbt.Keys._
import rugds.sbt._

object ScalaBuild extends Build {
  val project = (
    scalaProject("$name$")
    settings()
  )
}