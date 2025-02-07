package week1.fri.task

import scala.io.StdIn.readLine

object Extension extends App {

  private def greetUser(): Unit = {
    val name: String = readLine("Enter your name: ")
    println(s"Hello, $name")
  }

  private def makeConversation(): Unit = {
    val choice: String = readLine(
      "What do you want to talk about (weather, films, sports): "
    ).toLowerCase

    if (choice == "weather")
      println("It sure is nice outside today! Perfect weather for a walk in the park.")
    else if (choice == "films")
      println("You like movies, then? My favorite is Interstellar (2014)" +
        ", directed by Sir Christopher Nolan!")
    else if (choice == "sports")
      println("I don't really like sports...")
    else
      println("Nothing to talk about, huh?")
  }

  greetUser()

  while (true) {
    makeConversation()
    val continue: String = readLine("Do you want to continue (yes/no): ").toLowerCase
    if (continue != "yes") {
      println("Goodbye!")
      System.exit(0)
    }
  }
}
