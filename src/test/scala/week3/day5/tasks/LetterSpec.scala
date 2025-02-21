package week3.day5.tasks

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class LetterSpec extends AnyWordSpec with Matchers {
  "Name.nameOrError" should {
    "return Right(Name)" when {
      "input name is valid" in {
        val result: Either[InvalidNameError, Name] = Name.nameOrError("Tudor")

        val expectedResult: Right[Nothing, Name] = Right(Name("Tudor"))

        result shouldBe expectedResult
      }
    }

    "return Left(InvalidNameError)" when {
      "input name contains digits" in {
        val result: Either[InvalidNameError, Name] = Name.nameOrError("Tudor1")

        val expectedResult: Left[InvalidNameError, Nothing] =
          Left(InvalidNameError("Name contains digits"))

        result shouldBe expectedResult
      }
    }
  }

  "Postcode.postcodeOrError" should {
    "return Right(Postcode)" when {
      "input postcode is valid" in {
        val result: Either[InvalidPostcodeError, Postcode] = Postcode.postcodeOrError("XA3 M1B")

        val expectedResult: Right[Nothing, Postcode] = Right(Postcode("XA3 M1B"))

        result shouldBe expectedResult
      }
    }

    "return Left(InvalidPostcodeError)" when {
      "input is empty string" in {
        val result: Either[InvalidPostcodeError, Postcode] = Postcode.postcodeOrError("")

        val expectedResult: Left[InvalidPostcodeError, Nothing] =
          Left(InvalidPostcodeError("Invalid postcode"))

        result shouldBe expectedResult
      }

      // got lazy here. no more type checking
      "input contains too many whitespaces" in {
        Postcode.postcodeOrError("AB1  1DX") shouldBe Left(InvalidPostcodeError("Invalid postcode"))
        Postcode.postcodeOrError(" AB1 1DX") shouldBe Left(InvalidPostcodeError("Invalid postcode"))
        Postcode.postcodeOrError("AB1 1DX ") shouldBe Left(InvalidPostcodeError("Invalid postcode"))
      }

      "input doesn't contain exactly two words" in {
        Postcode.postcodeOrError("AB1 1DX 1Z") shouldBe Left(InvalidPostcodeError("Invalid postcode"))
        Postcode.postcodeOrError("AB11DX1") shouldBe Left(InvalidPostcodeError("Invalid postcode"))
      }
    }
  }

  "Letter.letterOrError" should {
    "return Right(Letter)" when {
      "input name and postcode are valid" in {
        Letter.letterOrError("Tudor", "XZ3 L9K") shouldBe Right(Letter(Name("Tudor"), Postcode("XZ3 L9K")))
      }
    }

    "return Left(InvalidNameError)" when {
      "name is invalid" in {
        Letter.letterOrError("Tudor1", "XZ3 L9K") shouldBe Left(InvalidNameError("Name contains digits"))
      }
    }

    "return Left(InvalidPostcodeError)" when {
      "postcode is invalid" in {
        Letter.letterOrError("Tudor", "XZ3  L9K") shouldBe Left(InvalidPostcodeError("Invalid postcode"))
      }

      "name or postcode are invalid, since the first flatMap is called on postcode" in {
        Letter.letterOrError("Tudor1", " XZ3 L9K") shouldBe Left(InvalidPostcodeError("Invalid postcode"))
      }
    }
  }
}
