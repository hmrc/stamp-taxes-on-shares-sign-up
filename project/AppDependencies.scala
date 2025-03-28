import sbt.*

object AppDependencies {

  private val bootstrapVersion = "9.11.0"

  val compile = Seq(
    "uk.gov.hmrc"             %% "bootstrap-backend-play-30"  % bootstrapVersion,
    "org.scalactic"           %% "scalactic"                  % "3.2.19",
    "uk.gov.hmrc"             %% "http-verbs-play-30"         % "15.2.0",
  )

  val test = Seq(
    "uk.gov.hmrc"             %% "bootstrap-test-play-30"         % bootstrapVersion  % Test,
    "org.scalatest"           %% "scalatest"                      % "3.2.19"          % Test,
    "org.scalatestplus.play"  %% "scalatestplus-play"             % "7.0.1"           % Test,
    "org.scalacheck"          %% "scalacheck"                     % "1.18.1"          % Test,
    "org.scalatestplus"       %% "scalacheck-1-18"                % "3.2.19.0"        % Test,
    "org.mockito"             %  "mockito-core"                   % "5.16.1"          % Test,
    "org.scalatestplus"       %% "mockito-5-12"                   % "3.2.19.0"        % Test,
  )

  val it = Seq.empty
}
