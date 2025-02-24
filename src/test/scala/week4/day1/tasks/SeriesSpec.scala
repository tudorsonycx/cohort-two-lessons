package week4.day1.tasks

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec
import week4.day1.tasks.Series.SeriesError

class SeriesSpec extends AnyWordSpec with Matchers {
  "Series.addN" should {
    "return Left(SeriesError)" when {
      "input is negative" in {
        Series.addN(-10) shouldBe Left(SeriesError("Input should be positive"))
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

  val list: List[Int] = (1 to 20).toList

  "Series.isEven" should {
    "return Left(SeriesError)" when {
      "input list ins empty" in {
        Series.isEven(List(), 1) shouldBe Left(SeriesError("List is empty"))
      }

      "index is out of bounds" in {
        Series.isEven(list, -1) shouldBe Left(SeriesError("Index is out of bounds"))
        Series.isEven(list, 21) shouldBe Left(SeriesError("Index is out of bounds"))
      }
    }

    "return Right(true)" when {
      "element at input index is even" in {
        Series.isEven(list, 1) shouldBe Right(true)
        Series.isEven(list, 19) shouldBe Right(true)
      }
    }

    "return Right(false)" when {
      "element at input index is odd" in {
        Series.isEven(list, 0) shouldBe Right(false)
        Series.isEven(list, 18) shouldBe Right(false)
      }
    }
  }
}
