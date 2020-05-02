import sbt._
import Keys._

object Build {
  val specs2_core       = "org.specs2"      %%  "specs2-core"         % "4.8.3"
  val specs2_scalacheck = "org.specs2"      %%  "specs2-scalacheck"   % "4.8.3"
  val scalacheck        = "org.scalacheck"  %%  "scalacheck"          % "1.14.3"

  implicit class ProjectOps(self: Project) {
    def standard: Project = {
      self
          .settings(organization := "org.picoworks")
          .settings(resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases")
          .settings(scalacOptions := Seq("-feature", "-deprecation", "-unchecked", "-Xlint", "-Yrangepos", "-encoding", "utf8"))
          .settings(scalacOptions in Test ++= Seq("-Yrangepos"))
    }

    def notPublished: Project = {
      self
          .settings(publish := {})
          .settings(publishArtifact := false)
    }

    def libs(modules: ModuleID*) = self.settings(libraryDependencies ++= modules)

    def testLibs(modules: ModuleID*) = self.libs(modules.map(_ % "test"): _*)
  }

}
