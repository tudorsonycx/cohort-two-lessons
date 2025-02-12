package week2.day3.codealong

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class UsernameSpec extends AnyWordSpec with Matchers {
  // Instantiate at top level because class constructor doesn't have parameters
  val username: Username = new Username

  "checkUsername" should {
    "return true" when {
      "the username is 8 chars long and all lowercase" in {
        val result: Boolean = username.checkUsername("username")

        val expectedResult: Boolean = true

        result shouldBe expectedResult
      }

      "the username is more than 8 chars long and all lowercase" in {
        val result: Boolean = username.checkUsername("username123")

        val expectedResult: Boolean = true

        result shouldBe expectedResult
      }
    }

    "return false" when {
      "the username is less than 8 chars long" in {
        val result: Boolean = username.checkUsername("user")

        val expectedResult: Boolean = false

        result shouldBe expectedResult
      }

      "the username is 8 chars long but not lowercase" in {
        val result: Boolean = username.checkUsername("usernamE")

        val expectedResult: Boolean = false

        result shouldBe expectedResult
      }

      "the username is more than 8 chars long but not lowercase" in {
        val result: Boolean = username.checkUsername("userName123")

        val expectedResult: Boolean = false

        result shouldBe expectedResult
      }
    }
  }
}
