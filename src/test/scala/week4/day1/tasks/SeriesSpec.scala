package week4.day1.tasks

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import week4.day1.tasks.Series.SeriesError

class SeriesSpec extends AnyWordSpec with Matchers {
  "Series.addN" should {
    "return Left(SeriesError)" when {
      "input is negative" in {
        Series.addN(-10) shouldBe Left(SeriesError())
      }
    }

    "return Right(0)" when {
      "input is 0" in {
        Series.addN(0) shouldBe Right(0)
      }
    }

    "return the sum of elements 1 through n" when {
      "input is greater than 0" in {
        Series.addN(1) shouldBe Right(1)
        Series.addN(10) shouldBe Right(55)
        Series.addN(123) shouldBe Right(7626)
        Series.addN(123456) shouldBe Right(7620753696L)
      }
    }
  }
}
