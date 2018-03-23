import rugds.sbt._


lazy val $name;format="camel"$Main = mainProject("$main_project_name$")
  .aggregate($name;format="camel"$Project)

lazy val $name;format="camel"$Project = defineProject(scalaProject, "$name$") settings (
  mainClass in Compile := Some("$organization$.$package$.$name;format="Camel"$Main")
)
