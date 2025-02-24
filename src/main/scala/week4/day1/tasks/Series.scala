package week4.day1.tasks

import scala.annotation.tailrec

object Series {
  case class SeriesError() extends Exception("Input should be positive")

  @tailrec
  def addN(n: Int, total: Long = 0): Either[SeriesError, Long] = {
    n match {
      case n if n < 0 => Left(SeriesError())
      case 0 => Right(total)
      case n => addN(n - 1, total + n)
    }
  }
}
