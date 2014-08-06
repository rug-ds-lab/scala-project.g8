addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.1.6")


val nexus     = "http://sm4all-project.eu/nexus"
val snapshots = nexus + "/content/repositories/rug.snapshot"
val releases  = nexus + "/content/repositories/rug.release"

val repositories = Seq(
  "RugDS Snapshots" at snapshots,
  "RugDS Releases"  at releases
)

resolvers ++= repositories


addSbtPlugin("rugds" % "sbt-scala-parent" % "0.0.1")