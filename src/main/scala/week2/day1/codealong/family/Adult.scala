package week2.day1.codealong.family

class FirstName(val firstName: String)

class LastName(val lastName: String)

class Adult(val firstName: FirstName, val lastName: LastName) {

  val under18: Boolean = false
}

object Adult {
  def apply(firstName: FirstName, lastName: LastName): Adult =
    new Adult(firstName, lastName)
}