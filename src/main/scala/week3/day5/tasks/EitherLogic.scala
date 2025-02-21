package week3.day5.tasks

object EitherLogic extends App {
  val letter: Right[Nothing, Letter] = Right(Letter(Name("A letter"), Postcode("xj1 1j5")))
  val invalidLetter: Left[InvalidNameError, Nothing] = Left(InvalidNameError("The name is invalid"))

  println(letter)
  println(invalidLetter)

  println(Postcode.postcodeOrError("ABC DEFG"))
  println(Postcode.postcodeOrError("AB1  CD2"))
  println(Postcode.postcodeOrError("  AB1"))
  println(Postcode.postcodeOrError("AB2  "))
  println(Postcode.postcodeOrError("AB3 "))
  println(Postcode.postcodeOrError(""))

  println(Name.nameOrError("123"))
  println(Name.nameOrError("ABC"))
  println(Name.nameOrError("A1B2C3"))
  println(Name.nameOrError("A B C"))

  println(Letter.letterOrError("Tudor", "AB1 DC2"))
  println(Letter.letterOrError("Tudor1 Dura", "AB1 DC2"))
  println(Letter.letterOrError("Tudor Dura", " AB1 DC2"))
  println(Letter.letterOrError("Tudor1 Dura", " AB1 DC2"))
}
