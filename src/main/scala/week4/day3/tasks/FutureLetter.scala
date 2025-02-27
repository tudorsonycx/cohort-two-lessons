package week4.day3.tasks

import week3.day5.tasks._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.{Duration, MILLISECONDS}
import scala.concurrent.{Await, Future}
import scala.util.{Failure, Random, Success}

object FutureLetter extends App {
  def fetchLetterOrError(name: String, postCode: String): Future[Either[GenericPostageError, Letter]] = Future({
    val sleepTime: Int = Random.nextInt(3000)
    println(f"Letter will be sent in ${sleepTime / 1000f} seconds")
    Thread.sleep(Random.nextInt(3000))
    Letter.letterOrError(name, postCode)
  })

  val eventualLetterOrError: Future[Either[GenericPostageError, Letter]] = fetchLetterOrError("Tudor", "JA9 19G1")

  eventualLetterOrError.value match {
    case Some(Success(letterOrError)) => println(s"Future succeeded: $letterOrError")
    case Some(Failure(exception)) => println(s"Future failed: $exception")
    case None => println("Future has not been completed")
  }

  println(Await.result(eventualLetterOrError, Duration(3100, MILLISECONDS)))
}
