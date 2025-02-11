package week2.day2.task.animals

case class Parrot(name: String, age: Int, dietType: DietType, feathersColor: String, wingSpan: Int)
  extends Bird {
  val species: String = "Psittacius erithacus"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (40 * 365, 60 * 365)
  val habitat: String = "Tropical and subtropical regions"

  def talk: String = s"$name is talking"
}
