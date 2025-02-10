package week2.day1.codealong.library

import week2.day1.codealong.family.{Adult, FirstName, LastName}

object LibraryLogic extends App {

  val harryPotter: Book = {
    new Book("Harry Potter", Adult(new FirstName("J.K"), new LastName("R"))) with AudioBook
  }

  println(harryPotter.author.firstName.firstName)
  println(harryPotter.title)
  println(harryPotter.read)
  println(harryPotter.enjoy)
}
