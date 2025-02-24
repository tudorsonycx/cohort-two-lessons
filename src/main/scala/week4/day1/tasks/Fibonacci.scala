package week4.day1.tasks

import scala.annotation.tailrec

case class FibonacciError() extends Exception("Input should be greater than 0")

object Fibonacci {
  @tailrec
  def getFibonacci(n: Int, first: Int = 0, second: Int = 1): Either[FibonacciError, Int] = {
    n match {
      case n if n < 1 => Left(FibonacciError())
      case 1 => Right(first)
      case 2 => Right(second)
      case n => getFibonacci(n - 1, second, first + second)
    }
  }
}
