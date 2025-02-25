package week4.day2.codealong

import scala.annotation.tailrec

object HOFunctions extends App {

  def hof1(x: Int, func: Int => Int): Int = {
    func(x)
  }

  def addTwo(number: Int): Int = number + 2

  def square(number: Int): Int = number * number

  def double(number: Int): Int = number * 2

  println(hof1(4, addTwo))
  println(hof1(4, square))
  println(hof1(4, double))

  def processList(list: List[String], f: String => String): List[String] = {
    @tailrec
    def iterate(hList: List[String], acc: List[String] = List()): List[String] = {
      hList match {
        case Nil => acc
        case head :: tail => iterate(tail, acc :+ f(head))
      }
    }

    iterate(list)
  }

  def toUpper(str: String): String = str.toUpperCase

  def addS(str: String): String = str + "s"

  def double(str: String): String = str * 2

  val stringList: List[String] = List("abc", "def", "ghi")

  println(processList(stringList, toUpper))
  println(processList(stringList, addS))
  println(processList(stringList, double))

  val numList: List[Int] = List(1, 2, 3, 4, 5)
  println(numList.foldLeft("")((acc, next) => acc + next))

  println(stringList.foldLeft("")((acc, word) => (acc + " " + word).trim))

  println(numList.foldLeft(1)(_ * _))

  def myFilter(list: List[Int], f: Int => Boolean, flip: Boolean = false): List[Int] = {
    @tailrec
    def iterate(hList: List[Int], acc: List[Int] = List()): List[Int] = {
      hList match {
        case Nil => acc
        case head :: tail => iterate(tail, if (f(head) != flip) acc :+ head else acc)
      }
    }

    iterate(list)
  }

  println(myFilter(numList, _ % 2 == 0, flip = true))

  println(stringList.foldLeft(0)(_ + _.length))
  println(processList(stringList, _.capitalize).mkString(" "))

  case class Employee(name: String, lengthOfEmployment: Int, salary: Double) {
    def payRise: Double => Double = {
      lengthOfEmployment match {
        case i if i < 3 => _ * 1.2
        case i if i < 5 => _ * 1.3
        case i if i == 5 => _ * 1.5
        case _ => _ * 1.1
      }
    }

    def getIncreasedSalary: Double = payRise(salary)
  }

  val e1: Employee = Employee("A", 7, 45000)
  println(e1.getIncreasedSalary)

  case class Item(price: Double)

  def applyDiscount(item: Item): () => Double = {
    item.price match {
      case d if d < 20 => () => d * 0.8
      case d if d < 50 => () => d * 0.6
      case d => () => d * 0.5
    }
  }

  val pictureFrame: Item = Item(56.00)
  val veryBigBeer: Item = Item(5)
  val randomWheel: Item = Item(45)

  println(applyDiscount(pictureFrame)())
  println(applyDiscount(veryBigBeer)())
  println(applyDiscount(randomWheel)())

}