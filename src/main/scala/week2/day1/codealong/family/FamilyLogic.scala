package week2.day1.codealong.family

object FamilyLogic extends App {

  // Class instantiation with keyword 'new'
  new Child("John")
  val child1: Child = new Child("John-2")
  val child2: Child = new Child("John-2")
  println(child1 == child2) // false
  println(child1.firstName)
  println(child1.under18)
  // println(child1.idPlease) - method idPlease cannot be accessed from outside
  // the Child class

  val adult1: Adult = new Adult(new FirstName("Tudor"), new LastName("Dura"))
  // create an instance without 'new' if the Adult companion object has defined
  // the apply method
  val adult2: Adult = Adult(new FirstName("Tudor"), new LastName("Dura"))

  println(adult1.firstName.firstName)
  println(adult1.lastName.lastName)
}
