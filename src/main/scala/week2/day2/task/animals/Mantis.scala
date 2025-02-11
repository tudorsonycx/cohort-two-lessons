package week2.day2.task.animals

class Mantis(val name: String, val age: Int, val dietType: DietType, val numberOfLegs: Int, val wingSpan: Int)
  extends Insect {
  val species: String = "Mantis religiosa"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (365 / 2, 365)
  val habitat: String = "Grasslands, forests, meadows, gardens, shrubs, and fields"

  def molt: String = s"$name is molting"
}

object Mantis {
  def apply(name: String, age: Int, dietType: DietType, numberOfLegs: Int, wingSpan: Int): Mantis =
    new Mantis(name, age, dietType, numberOfLegs, wingSpan)
}