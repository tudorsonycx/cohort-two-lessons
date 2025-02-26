package week4.day3.codealong

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object FutureAddition extends App {
  def additionInFuture(a: Int, b: Int): Future[Int] = Future({
    Thread.sleep(1000)
    a + b
  })

  println("Waiting for the shitty addition...")
  additionInFuture(10, 90).onComplete({
    case Success(value) => println(s"There it is using onComplete... $value")
    case Failure(exception) => println(s"Shit hit the fan somewhere: $exception")
  })

  additionInFuture(30, 25).foreach(res => println(s"There it is using foreach... $res"))

  Thread.sleep(2000)
}
