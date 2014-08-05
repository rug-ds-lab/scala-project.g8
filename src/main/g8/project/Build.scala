import sbt._
import rug.sbt._

object ScalaBuild extends Build {
  val project = (
    scalaProject("$name$")
    settings()
  )
}