
val nexus     = "http://nexus.rugds.org"
val snapshots = nexus + "/repository/rugds.snapshot.private"
val releases  = nexus + "/repository/rugds.release.private"

val nexusOss     = "http://nexus.rugds.org"
val snapshotsOss = nexusOss + "/repository/rugds.snapshot.oss"
val releasesOss  = nexusOss + "/repository/rugds.release.oss"


val repositories = Seq(
  "RugDS Private Snapshots" at snapshots,
  "RugDS Private Releases"  at releases,
  "RugDS OSS Snapshots"     at snapshotsOss,
  "RugDS OSS Releases"      at releasesOss,
  "typesafe"                at "http://repo.typesafe.com/typesafe/releases",
  "scalaz-bintray"          at "http://dl.bintray.com/scalaz/releases",
  "sbt-plugin-releases"     at "https://repo.scala-sbt.org/scalasbt/sbt-plugin-releases"
)

resolvers ++= repositories


addSbtPlugin("rugds" % "sbt-scala-parent" % "0.9.0")