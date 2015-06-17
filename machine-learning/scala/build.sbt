name := "movielens-als"

version := "1.0.0"

scalaVersion := "2.10.3"

EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.Resource

unmanagedBase := baseDirectory.value / "lib"

libraryDependencies ++= Seq(
	"org.apache.spark" % "spark-mllib_2.10" % "0.9.0-incubating"
)

