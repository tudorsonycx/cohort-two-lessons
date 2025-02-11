package week2.day2.task.extension.vehicles

case class Car(make: String, model: String, year: Int, color: String, fuelType: FuelType, wheels: Int, doors: Int)
  extends LandVehicle {

  def race(opponent: Car): String =
    s"The $make $model is racing with the ${opponent.make} ${opponent.model}"

  def playMusic(volume: Int): String = s"The $make $model is playing music at volume $volume"

  def openTrunk: String = s"The $make $model is opening the trunk"
}
