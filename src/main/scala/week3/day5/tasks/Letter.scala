package week3.day5.tasks

case class Name(value: String)

object Name {
  def nameOrError(maybeName: String): Either[InvalidNameError, Name] = {
    maybeName match {
      case s if s.exists(_.isDigit) => Left(InvalidNameError("Name contains digits"))
      case s => Right(Name(s))
    }
  }
}

case class Postcode(value: String)

object Postcode {
  def postcodeOrError(maybePostCode: String): Either[InvalidPostcodeError, Postcode] = {
    maybePostCode match {
      case s if s.startsWith(" ") || s.endsWith(" ") || s.count(_ == ' ') != 1 =>
        Left(InvalidPostcodeError("Invalid postcode"))
      case s => Right(Postcode(s))
    }
  }
}

case class Letter(name: Name, postcode: Postcode)

trait GenericPostageError {
  val message: String
}

object Letter {
  def letterOrError(maybeName: String, maybePostCode: String): Either[GenericPostageError, Letter] = {
    val postcode: Either[InvalidPostcodeError, Postcode] = Postcode.postcodeOrError(maybePostCode)
    val name: Either[InvalidNameError, Name] = Name.nameOrError(maybeName)
    postcode.flatMap(postcode => {
      name.map(name => {
        Letter(name, postcode)
      })
    })
  }
}

case class InvalidNameError(message: String) extends GenericPostageError

case class InvalidPostcodeError(message: String) extends GenericPostageError
