package week2.day3.codealong

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class NameLengthSpec extends AnyWordSpec with Matchers{
  val nameLength = new NameLength

  "getNameLength" should {
    "return length of firstName" when {
      "firstName is longer than lastName" in {
        val result: Int = nameLength.getNameLength("Tom", "H")

        val expectedResult: Int = 3

        result shouldBe expectedResult
      }
    }

    "return length of lastName" when {
      "lastName is longer than firstName" in {
        val result: Int = nameLength.getNameLength("Tom", "Holland")

        val expectedResult: Int = 7

        result shouldBe expectedResult
      }
    }

    "return 0" when {
      "firstName is as long as lastName" in {
        val result: Int = nameLength.getNameLength("Tom", "Tom")

        val expectedResult: Int = 0

        result shouldBe expectedResult
      }
    }
  }
}
