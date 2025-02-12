package week2.day3.codealong

class NameLength {
  def getNameLength(firstName: String, lastName: String): Int = {
    if (firstName.length > lastName.length) {
      firstName.length
    } else if (firstName.length < lastName.length) {
      lastName.length
    } else 0
  }
}
