package week2.day1.codealong

import scala.annotation.tailrec

class Child(val firstName: String) {

  val under18: Boolean = true

  private def idPlease: String = "Can I see your ID?"
}

// Companion object
object Child {

  def apply(firstName: String) = new Child(firstName)

  // Access the companion class private methods
  private val bob: Child = Child("Bob")
  bob.idPlease
}