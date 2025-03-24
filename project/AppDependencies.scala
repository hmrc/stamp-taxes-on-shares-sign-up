import play.sbt.PlayImport.*
import sbt.*

object AppDependencies {

  private val bootstrapVersion = "9.7.0"
  

  val compile = Seq(
    "uk.gov.hmrc"       %% "bootstrap-backend-play-30"  % bootstrapVersion,
    "uk.gov.hmrc"       %% "http-verbs-play-30"         % "15.2.0",

  )

  val test = Seq(
    "uk.gov.hmrc"       %% "bootstrap-test-play-30"     % bootstrapVersion            % Test,
    
  )

  val it = Seq.empty
}
