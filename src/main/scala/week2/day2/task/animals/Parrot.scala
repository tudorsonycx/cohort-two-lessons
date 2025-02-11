package week2.day2.task.animals

class Parrot(val name: String, val age: Int, val dietType: DietType, val feathersColor: String, val wingSpan: Int)
  extends Bird {
  val species: String = "Psittacius erithacus"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (40 * 365, 60 * 365)
  val habitat: String = "Tropical and subtropical regions"

  def talk(): Unit = println(s"$name is talking")
}

object Parrot {
  def apply(name: String, age: Int, dietType: DietType, feathersColor: String, wingSpan: Int): Parrot =
    new Parrot(name, age, dietType, feathersColor, wingSpan)
}