package week2.day2.task.extension.vehicles

trait LandVehicle extends Vehicle {
  val wheels: Int
  val doors: Int

  override def describe: String = s"${super.describe} with $wheels wheels and $doors doors"

  def drive: String = s"The $make $model is driving"

  def honk: String = s"The $make $model is honking"

  def park: String = s"The $make $model is parking"
}
