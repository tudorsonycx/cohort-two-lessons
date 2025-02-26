package week3.day5.codealong

import java.time.LocalDate

object Eithers extends App {

  def isOddV1(x: Int): Either[Boolean, String] = {
    if (x % 2 != 0) {
      Right("It is odd")
    } else {
      Left(false)
    }
  }

  println(isOddV1(4))
  println(isOddV1(7))

  class NewError(val code: Int, val message: String) extends Exception(message)

  case object IsOddError extends NewError(400, "Input isn't odd")

  def isOddV2(x: Int): Either[NewError, String] = {
    if (x % 2 != 0) {
      Right(s"$x is odd")
    } else {
      Left(IsOddError)
    }
  }

  println(isOddV2(4))
  println(isOddV2(9))

  def plusOne(x: String): Either[String, Int] = {
    try {
      Right(x.toInt + 1)
    } catch {
      case e: Exception => Left(s"Failed due to: $e")
    }
  }

  println(plusOne("10"))
  println(plusOne("ten"))

  case object UserError extends NewError(400, "User fields are invalid")

  case object UserUsernameError extends NewError(400, "Username is less than 12 chars long")

  case object UserPasswordLengthError extends NewError(400, "Password is too short")

  case object UserPasswordLowerCharError extends NewError(400, "Password must contain lowercase chars")

  case object UserPasswordUpperCharError extends NewError(400, "Password must contain uppercase chars")

  case object UserPasswordDigitError extends NewError(400, "Password must contain a digit")

  case object UserPasswordSpecialCharError extends NewError(400, "Password must contain a special character")

  case object UserDateOfBirthUnder18Error extends NewError(400, "Age must be at least 18")


  case class User(username: String, password: String, dateOfBirth: LocalDate)

  object User {
    def validateUsername(username: String): Either[NewError, String] = {
      if (username.length > 11) {
        Right(username)
      } else {
        Left(UserUsernameError)
      }
    }

    def validatePassword(password: String): Either[NewError, String] = {
      val specialChars: List[Char] = List('!', '#', '%')

      password match {
        case p if p.length < 8 => Left(UserPasswordLengthError)
        case p if !p.exists(_.isUpper) => Left(UserPasswordUpperCharError)
        case p if !p.exists(_.isLower) => Left(UserPasswordLowerCharError)
        case p if !p.exists(_.isDigit) => Left(UserPasswordDigitError)
        case p if !p.exists(specialChars.contains) => Left(UserPasswordSpecialCharError)
        case p => Right(p)
      }
    }

    def validateDateOfBirth(dateOfBirth: LocalDate): Either[NewError, LocalDate] = {
      if (dateOfBirth.until(LocalDate.now()).getYears < 18) {
        Left(UserDateOfBirthUnder18Error)
      } else {
        Right(dateOfBirth)
      }
    }

    def validateUser(user: User): Either[NewError, User] = {
      for {
        username <- validateUsername(user.username)
        password <- validatePassword(user.password)
        dateOfBirth <- validateDateOfBirth(user.dateOfBirth)
      } yield User(username, password, dateOfBirth)
    }
  }

  println(User.validateUsername("user"))
  println(User.validateUsername("username1234"))

  println(User.validatePassword("abc"))
  println(User.validatePassword("ABCDEFGH"))
  println(User.validatePassword("abcdefgh"))
  println(User.validatePassword("Abcdefgh"))
  println(User.validatePassword("Abcdefg1"))
  println(User.validatePassword("Abcdef1!"))

  println(User.validateDateOfBirth(LocalDate.of(2007, 2, 22)))
  println(User.validateUser(User("asdasdsaad", "ASDasdasd!1", LocalDate.of(2000, 1, 1))))
  
}

