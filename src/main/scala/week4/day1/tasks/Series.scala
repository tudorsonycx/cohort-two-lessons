package week4.day1.tasks

import scala.annotation.tailrec

object Series {
  case class SeriesError(message: String) extends Exception(message)


  @tailrec
  def addN(n: Int, total: Long = 0): Either[SeriesError, Long] = {
    n match {
      case n if n < 0 => Left(SeriesError("Input should be positive"))
      case 0 => Right(total)
      case n => addN(n - 1, total + n)
    }
  }

  def isEven(list: List[Int], idx: Int): Either[SeriesError, Boolean] = {
    @tailrec
    def isEvenHelper(currIdx: Int = 0): Either[SeriesError, Boolean] = {
      currIdx match {
        case i if i >= list.length => Left(SeriesError("Index is out of bounds"))
        case `idx` => Right(list(currIdx) % 2 == 0)
        case _ => isEvenHelper(currIdx + 1)
      }
    }

    list match {
      case Nil => Left(SeriesError("List is empty"))
      case l =>
        isEvenHelper()
    }
  }
}
