package week4.day3.codealong

import java.util.concurrent.TimeUnit
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.util.Random

object PizzaOrder extends App {
  val randomNumGen: Random = new Random()

  val f1: Future[String] = Future({
    val randSleepTime = randomNumGen.nextInt(3001)
    println(s"f1 sleeping $randSleepTime milliseconds")
    Thread.sleep(randSleepTime)
    println("Done sleeping f1")
    "User: Alice"
  })

  val f2: Future[String] = Future({
    val randSleepTime = randomNumGen.nextInt(3001)
    println(s"f2 sleeping $randSleepTime milliseconds")
    Thread.sleep(randSleepTime)
    println("Done sleeping f2")
    randSleepTime match {
      case i if i > 2000 => "Order: Salad"
      case _ => "Order: Pizza"
    }
  })

  val combined: Future[String] = f1.flatMap(s1 => f2.map(s2 => s1 + s2))

  val combinedResult: String = Await.result(combined, Duration(3, TimeUnit.SECONDS))

  println(combinedResult)
}
