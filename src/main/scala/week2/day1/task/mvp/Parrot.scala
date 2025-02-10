package week2.day1.task.mvp

class Parrot(val name: String, val age: Int, val feathersColor: String, val wingSpan: Int)
  extends Bird with Flyable {
  val species: String = "Psittacius erithacus"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (40 * 365, 60 * 365)
  val habitat: String = "Tropical and subtropical regions"

  def talk(): Unit = println(s"$name is talking")
}

object Parrot {
  def apply(name: String, age: Int, feathersColor: String, wingSpan: Int) =
    new Parrot(name, age, feathersColor, wingSpan)
}