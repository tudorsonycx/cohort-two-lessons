package week4.day1.tasks

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class FibonacciSpec extends AnyWordSpec with Matchers {
  "Fibonacci.getFibonacci" should {
    "return Right(0)" when {
      "n is 1" in {
        Fibonacci.getFibonacci(1) shouldBe Right(0)
      }
    }

    "return Right(1)" when {
      "n is 2" in {
        Fibonacci.getFibonacci(2) shouldBe Right(1)
      }
    }

    "return the n-th Fibonacci number" when {
      "n is greater than 2" in {
        Fibonacci.getFibonacci(3) shouldBe Right(1)
        Fibonacci.getFibonacci(10) shouldBe Right(34)
        Fibonacci.getFibonacci(20) shouldBe Right(4181)
        Fibonacci.getFibonacci(30) shouldBe Right(514229)
      }
    }

    "return Left(FibonacciError)" when {
      "n is less than 1" in {
        Fibonacci.getFibonacci(0) shouldBe Left(FibonacciError())
        Fibonacci.getFibonacci(-10) shouldBe Left(FibonacciError())
      }
    }
  }
}
