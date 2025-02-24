package week4.day1.codealong

import scala.annotation.tailrec

object Recursion extends App {
  // Standard recursion
  // recursive calls which call the original method inside the method

  // Factorial method
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      val result: Int = n * factorial(n - 1)
      result
    }
  }

  println(factorial(10))

  // TAIL RECURSION
  // Smarter way to write recursion because it stops stack overflow errors
  // Key differences:
  // 1. The recursive call must be the last thing the method does (@tailerc - will check this)
  // 2. Prevents tack overflow errors
  // a. doesn't need to remember all previous values, all needed information is passed through as an accumulator (acc)
  // b. Scala replaces recursive calls with a simple loop under the hood, called the tail call optimization (TCO)
  // Replaces and updates the acc with every recursive call

  def smarterFactorial(n: Int): Int = {

    def helperFactorial(hn: Int, acc: Int): Int = {
      if (hn <= 1) acc
      else {
        helperFactorial(hn - 1, acc * hn)
      }
    }

    helperFactorial(n, 1)
  }

  println(smarterFactorial(10))

  @tailrec
  def smarterFactorialNoHelper(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else smarterFactorialNoHelper(n - 1, acc * n)
  }

  println(smarterFactorialNoHelper(4))

  def concatenateWords(aWord: String, n: Int): String = {
    @tailrec
    def concatenateWordsHelper(hAWord: String, hn: Int, acc: String = aWord): String = {
      if (hn <= 0) acc
      else concatenateWordsHelper(hAWord, hn - 1, acc + hAWord)
    }

    concatenateWordsHelper(aWord, n)
  }

  println(concatenateWords("word1", 1))

  def getListLength(list: List[String]): Int = {
    if (list.isEmpty) 0
    else 1 + getListLength(list.tail)
  }

  println(getListLength(List("A", "B", "C", "D")))

  @tailrec
  def getListLengthTailRec[T](list: List[T], acc: Int = 0): Int = {
    list match {
      case l if l.isEmpty => acc
      case _ => getListLengthTailRec(list.tail, acc + 1)
    }
  }

  println(getListLengthTailRec(List(1, 2, 3)))
}
