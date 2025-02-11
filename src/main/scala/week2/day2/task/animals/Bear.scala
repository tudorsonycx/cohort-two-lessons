package week2.day2.task.animals

case class Bear(name: String, age: Int, dietType: DietType, furColor: String, isPregnant: Boolean)
  extends Mammal {
  val species: String = "Ursus arctos"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (365 * 20, 365 * 30)
  val habitat = "Forests, mountains, and grasslands"

  def hibernate: String = s"$name is hibernating"

  def hunt: String = s"$name is hunting"
}
