package week4.day2.tasks

import scala.annotation.tailrec

object MVP extends App {
  def intDoubler(num: Int): Int = num * 2

  def applyTwice(num: Int, f: Int => Int): Int = f(f(num))

  println(applyTwice(4, intDoubler))

  def add(num1: Double, num2: Double): Double = num1 + num2

  def multiply(num1: Double, num2: Double): Double = num1 * num2

  def subtract(num1: Double, num2: Double): Double = num1 - num2

  def divide(num1: Double, num2: Double): Double = num1 / num2

  def applyOperation(num1: Double, num2: Double, f: (Double, Double) => Double): Double = f(num1, num2)

  println(applyOperation(10, 15, add))
  println(applyOperation(10, 15, multiply))
  println(applyOperation(10, 15, subtract))
  println(applyOperation(10, 15, divide))

  def toUpperChar(codePoint: Int): Char = {
    if (codePoint >= 97 && codePoint <= 122) (codePoint - 32).toChar
    else codePoint.toChar
  }

  def toLowerChar(codePoint: Int): Char = {
    if (codePoint >= 65 && codePoint <= 90) (codePoint + 32).toChar
    else codePoint.toChar
  }

  def convertString(str: String, makeUpper: Boolean = false): String = {
    val transform: Int => Char = if (makeUpper) toUpperChar else toLowerChar

    @tailrec
    def iterate(iStr: String, acc: String = ""): String = {
      iStr match {
        case "" => acc
        case _ =>
          val headCodePoint: Int = iStr.head.toInt
          val updatedHeadChar: Char = transform(headCodePoint)
          iterate(iStr.tail, acc + updatedHeadChar)
      }
    }

    iterate(str)
  }

  println(convertString("AsdAsdfg!?# Zxcaj2j13.,&"))
  println(convertString("AsdAsdfg!?# Zxcaj2j13.,&", makeUpper = true))

  case object OperationError extends Exception("Invalid operation")

  def calculate(operation: String): Either[OperationError.type, (Double, Double) => Double] = {
    operation match {
      case "add" => Right(add)
      case "multiply" => Right(multiply)
      case "subtract" => Right(subtract)
      case "divide" => Right(divide)
      case _ => Left(OperationError)
    }
  }

  println(calculate("add").map(_(10, 15)))
  println(calculate("multiply").map(_(10, 15)))
  println(calculate("subtract").map(_(10, 15)))
  println(calculate("divide").map(_(10, 15)))
  println(calculate("power").map(_(10, 15)))

  def max(d1: Double, d2: Double): Double = if (d1 > d2) d1 else d2

  def min(d1: Double, d2: Double): Double = if (d1 < d2) d1 else d2

  def reduceList(list: List[Double], f: (Double, Double) => Double): Either[Exception, Double] = {
    @tailrec
    def iterate(hList: List[Double], acc: Double = list.head): Double = {
      hList match {
        case Nil => acc
        case head :: tail => iterate(tail, f(acc, head))
      }
    }

    list match {
      case Nil => Left(new Exception("List is empty"))
      case _ :: tail => Right(iterate(tail))
    }

  }

  println(reduceList(List(-16.51, 1.23, 4.56, -5.123, 10, 10.01, 6.666), max))
  println(reduceList(List(-16.51, 1.23, 4.56, -5.123, 10, 10.01, 6.666), min))
  println(reduceList(List(), min))

  def triple(num: Int): Int = num * 3

  def square(num: Int): Int = num * num

  def applyFunc(givenInt: Int, f: Int => Int): Int = {
    f(givenInt)
  }

  println(applyFunc(5, triple))
  println(applyFunc(5, square))

  def uglyPower(exponent: Int): Int => Int = {
    def toExponent(base: Int): Int = {
      @tailrec
      def toExponentHelper(hExponent: Int, acc: Int = 1): Int = {
        hExponent match {
          case i if i <= 0 => acc
          case _ => toExponentHelper(hExponent - 1, acc * base)
        }
      }

      toExponentHelper(exponent)
    }

    toExponent
  }

  println(uglyPower(3)(3))
  println(uglyPower(0)(100))
  println(uglyPower(4)(100))

  def uglySquare(num: Int): Int = uglyPower(2)(num)

  println(uglySquare(6))
  println(uglySquare(10))

  def power(exponent: Int): Int => Int = {
    def toExponent(base: Int): Int = Math.pow(base, exponent).toInt

    toExponent
  }

  def normalSquare(num: Int): Int = power(2)(num)

  println(normalSquare(6))
  println(normalSquare(10))
}
