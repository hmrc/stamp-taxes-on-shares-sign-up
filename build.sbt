import uk.gov.hmrc.DefaultBuildSettings

ThisBuild / majorVersion      := 0
ThisBuild / scalaVersion      := "3.3.5"                          // Latest LTS Version.
ThisBuild / organization      := "uk.gov.hmrc"
ThisBuild / organizationName  := "HMRC"
ThisBuild / scalacOptions     += "-Wconf:msg=Flag.*repeatedly:s"  // Silence complaints about repeated flags

ThisBuild / resolvers += MavenRepository("HMRC-open-artefacts-maven2", "https://open.artefacts.tax.service.gov.uk/maven2")
ThisBuild / resolvers += Resolver.url("HMRC-open-artefacts-ivy2", url("https://open.artefacts.tax.service.gov.uk/ivy2"))(Resolver.ivyStylePatterns)
ThisBuild / resolvers += Resolver.typesafeRepo("releases")

lazy val microservice = Project("stamp-taxes-on-shares-sign-up", file("."))
  .enablePlugins(play.sbt.PlayScala, SbtDistributablesPlugin)
  .settings(
    libraryDependencies ++= AppDependencies.compile ++ AppDependencies.test,
  )
  // Suppress warnings in .routes files
  .settings(scalacOptions += "-Wconf:src=.*.routes:silent")
  .settings(resolvers += Resolver.jcenterRepo)
  .settings(CodeCoverageSettings.settings *)

lazy val it = project
  .enablePlugins(PlayScala)
  .dependsOn(microservice % "test->test")
  .settings(DefaultBuildSettings.itSettings())
  .settings(libraryDependencies ++= AppDependencies.it)


