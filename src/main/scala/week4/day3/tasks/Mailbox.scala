package week4.day3.tasks

import week3.day5.tasks.{GenericPostageError, Letter}
import week4.day3.tasks.FutureLetter.fetchLetterOrError

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Success}

object Mailbox extends App {
  val eventualLetterOrError1: Future[Either[GenericPostageError, Letter]] =
    fetchLetterOrError("John", "XX9 9XX")
  val eventualLetterOrError2: Future[Either[GenericPostageError, Letter]] =
    fetchLetterOrError("David1", "M1 1AA")
  val eventualLetterOrError3: Future[Either[GenericPostageError, Letter]] =
    fetchLetterOrError("Tudor", "JA9  19G1")

  Thread.sleep(3000)

  val eventualMailbox: Future[List[Either[GenericPostageError, Letter]]] =
    eventualLetterOrError1.flatMap(lOrErr1 =>
      eventualLetterOrError2.flatMap(lOrErr2 =>
        eventualLetterOrError3.map(lOrErr3 => List(lOrErr1, lOrErr2, lOrErr3))))

  // Need to wait a bit for the eventualMailbox future to be completed
  // Thread.sleep(50)
  println(eventualMailbox)

  eventualMailbox.onComplete({
    case Success(mailbox) => println(mailbox)
    case Failure(exception) => println(exception)
  })

}
