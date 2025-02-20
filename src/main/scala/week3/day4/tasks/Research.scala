package week3.day4.tasks

import scala.reflect.runtime.universe._

object Research extends App {
  def checkTypeList[T: TypeTag](list: List[T]): String = {
    list match {
      case _ if typeOf[T] =:= typeOf[Double] => "List of Doubles"
      case _ if typeOf[T] =:= typeOf[String] => "List of Strings"
      case _ if typeOf[T] =:= typeOf[Int] => "List of Ints"
      case _ => "List of Unknown"
    }
  }

  val numList: List[Int] = List(1, 2, 3)
  val doubleList: List[Double] = List(1.0, 2.0, 3.0)
  val stringList: List[String] = List("1", "2", "3")

  println(checkTypeList(numList))
  println(checkTypeList(doubleList))
  println(checkTypeList(stringList))
  println(checkTypeList(List(true, false)))
}
