package week4.day1.tasks

import scala.annotation.tailrec

sealed abstract class Euro2024Team(val name: String)

object Euro2024Team {
  case object Albania extends Euro2024Team("Albania")

  case object Austria extends Euro2024Team("Austria")

  case object Belgium extends Euro2024Team("Belgium")

  case object Croatia extends Euro2024Team("Croatia")

  case object CzechRepublic extends Euro2024Team("Czech Republic")

  case object Denmark extends Euro2024Team("Denmark")

  case object England extends Euro2024Team("England")

  case object France extends Euro2024Team("France")

  case object Georgia extends Euro2024Team("Georgia")

  case object Germany extends Euro2024Team("Germany")

  case object Hungary extends Euro2024Team("Hungary")

  case object Italy extends Euro2024Team("Italy")

  case object Netherlands extends Euro2024Team("Netherlands")

  case object Poland extends Euro2024Team("Poland")

  case object Portugal extends Euro2024Team("Portugal")

  case object Romania extends Euro2024Team("Romania")

  case object Scotland extends Euro2024Team("Scotland")

  case object Serbia extends Euro2024Team("Serbia")

  case object Slovakia extends Euro2024Team("Slovakia")

  case object Slovenia extends Euro2024Team("Slovenia")

  case object Spain extends Euro2024Team("Spain")

  case object Switzerland extends Euro2024Team("Switzerland")

  case object Turkey extends Euro2024Team("Turkey")

  case object Ukraine extends Euro2024Team("Ukraine")

  val values: List[Euro2024Team] = List(
    Albania, Austria, Belgium, Croatia, CzechRepublic, Denmark, England, France,
    Georgia, Germany, Hungary, Italy, Netherlands, Poland, Portugal, Romania,
    Scotland, Serbia, Slovakia, Slovenia, Spain, Switzerland, Turkey, Ukraine
  )

  @tailrec
  def printAll(teams: List[Euro2024Team] = values): Unit = {
    teams match {
      case Nil => ()
      case ::(head, tail) => ()
        println(head)
        printAll(tail)
    }
  }
}
