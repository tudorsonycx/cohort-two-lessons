package week2.day3.codealong

import org.scalatest.flatspec.AnyFlatSpec

class FizzBuzzSpec extends AnyFlatSpec {
  "fizzBuzz" should "return 'Fizz' if divisible by 3 only" in {
    assert(FizzBuzz.fizzBuzz(6) == "Fizz")
  }

  "fizzBuzz" should "return 'Buzz' if divisible by 5 only" in {
    assert(FizzBuzz.fizzBuzz(10) == "Buzz")
  }

  "fizzBuzz" should "return 'FizzBuzz' if divisible by 3 and 5" in {
    assert(FizzBuzz.fizzBuzz(15) == "FizzBuzz")
  }

  "fizzBuzz" should "return the number in string form if not divisible by 3 or 5" in {
    assert(FizzBuzz.fizzBuzz(32) == "32")
  }
}
