package week4.day3.codealong

import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Future}
import scala.concurrent.duration.{Duration, FiniteDuration}
import scala.util.{Failure, Success}
import week3.day5.codealong.Eithers.{NewError, isOddV2}

import scala.util

object Futures extends App {

  val futureHelloWorld: Future[String] = Future({
    Thread.sleep(2000)
    "Hello Future World"
  })

  futureHelloWorld.foreach(result => println(s"Using foreach: $result"))

  futureHelloWorld.onComplete({
    case Success(result) => println(s"Using onComplete: $result")
    case Failure(exception) => println(s"Failure with onComplete: ${exception.getMessage}")
  })

  val waitTime: FiniteDuration = Duration(5, TimeUnit.SECONDS)
  println(s"Using await: ${Await.result(futureHelloWorld, waitTime)}")

  println("I'm printed after the futures are called")

  def fetchIsOddOrErrorInTheFuture(num: Int): Future[Either[NewError, String]] = Future({
    Thread.sleep(1000)
    isOddV2(num)
  })

  val futureIsOddOrError1: Future[Either[NewError, String]] = fetchIsOddOrErrorInTheFuture(12)
  val futureIsOddOrError2: Future[Either[NewError, String]] = fetchIsOddOrErrorInTheFuture(11)


  Thread.sleep(1100)
  val result1 = futureIsOddOrError1.value match {
    case Some(Success(complete)) => s"Future completed $complete"
    case None => "Future did not complete in the given time"
  }

  val result2 = futureIsOddOrError2.value match {
    case Some(Success(complete)) => s"Future completed $complete"
    case None => "Future did not complete in the given time"
  }

  println(result1)
  println(result2)

  val futureInt1: Future[Int] = Future({
    100
  })
  val futureInt2: Future[Int] = Future({
    150
  })

  val combinedFutureInt = futureInt1.flatMap(fi1 => futureInt2.map(fi2 => fi1 + fi2))

  println(Await.result(combinedFutureInt, waitTime))

  Thread.sleep(3000)
}
