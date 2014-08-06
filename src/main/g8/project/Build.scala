import sbt._
import rugds.sbt._

object ScalaBuild extends Build {
  val project = (
    scalaProject("$name$")
    settings()
  )
}