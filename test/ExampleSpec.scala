
import play.api.mvc.{ Action, Results }
import play.api.test.FakeApplication
import org.scalatestplus.play.{ HtmlUnitFactory, OneBrowserPerSuite, OneServerPerSuite, PlaySpec }
import org.scalatestplus.play.FirefoxFactory

class ExampleSpec extends PlaySpec with OneServerPerSuite with OneBrowserPerSuite with FirefoxFactory {

  "The OneBrowserPerTest trait" must {
    "provide a web driver" in {
      go to (s"http://localhost:$port")
      pageTitle mustBe "Hello World"
    }
  }
}
