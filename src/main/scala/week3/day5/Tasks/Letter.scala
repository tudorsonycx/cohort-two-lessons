package week3.day5.Tasks

case class Name(value: String)

case class Postcode(value: String)

case class Letter(name: Name, postcode: Postcode)

trait GenericPostageError {
  val message: String
}

case class InvalidNameError(message: String) extends GenericPostageError

case class InvalidPostcodeError(message: String) extends GenericPostageError
