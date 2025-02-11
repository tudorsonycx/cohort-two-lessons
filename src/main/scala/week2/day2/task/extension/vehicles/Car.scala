package week2.day2.task.extension.vehicles

case class Car(make: String, model: String, year: Int, color: String, fuelType: FuelType, wheels: Int, doors: Int)
  extends LandVehicle {

  def race: String = s"The $make $model is racing"

  def playMusic: String = s"The $make $model is playing music"

  def openTrunk: String = s"The $make $model is opening the trunk"
}
