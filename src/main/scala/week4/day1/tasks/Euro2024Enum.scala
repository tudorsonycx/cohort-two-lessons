package week4.day1.tasks

import scala.annotation.tailrec

object Euro2024Enum extends Enumeration {
  val Albania,
  Austria,
  Belgium,
  Croatia,
  CzechRepublic,
  Denmark,
  England,
  France,
  Georgia,
  Germany,
  Hungary,
  Italy,
  Netherlands,
  Poland,
  Portugal,
  Romania,
  Scotland,
  Serbia,
  Slovakia,
  Slovenia,
  Spain,
  Switzerland,
  Turkey,
  Ukraine = Value

  @tailrec
  def printAll(teams: ValueSet = values): Unit = {
    teams match {
      case vs if vs.isEmpty => ()
      case vs =>
        println(vs.head)
        printAll(vs.tail)
    }
  }
}
