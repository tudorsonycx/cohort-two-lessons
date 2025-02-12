package week2.day3.codealong

import org.scalatest.flatspec.AnyFlatSpec

class TwoNumbersSpec extends AnyFlatSpec {
  "add" should "add x and y" in {
    val twoNumbers: TwoNumbers = new TwoNumbers(1, 2)
    assert(twoNumbers.add == 3)
  }

  "subtract" should "subtract y from x" in {
    val twoNumbers: TwoNumbers = new TwoNumbers(6, 2)
    assert(twoNumbers.subtract == 4)
  }

  "multiply" should "multiply x by y" in {
    val twoNumbers: TwoNumbers = new TwoNumbers(3, 3)
    assert(twoNumbers.multiply == 9)
  }
}
