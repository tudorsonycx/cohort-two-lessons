package week2.day3.codealong

// Username must have at least 8 characters
// Must be all lowercase
class Username {
  def checkUsername(username: String): Boolean = {
    if (username.length >= 8 && username.toLowerCase == username) {
      true
    } else {
      false
    }
  }
}
