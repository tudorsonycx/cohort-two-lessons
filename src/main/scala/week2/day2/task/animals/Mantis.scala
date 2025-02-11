package week2.day2.task.animals

case class Mantis(name: String, age: Int, dietType: DietType, numberOfLegs: Int, wingSpan: Int)
  extends Insect {
  val species: String = "Mantis religiosa"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (365 / 2, 365)
  val habitat: String = "Grasslands, forests, meadows, gardens, shrubs, and fields"

  def molt: String = s"$name is molting"
}
