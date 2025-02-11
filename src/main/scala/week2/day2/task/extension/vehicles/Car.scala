package week2.day2.task.extension.vehicles

class Car(make: String, val model: String, val fuelType: String) extends Vehicle(make) {
  override val description: String = s"This vehicle is a $make $model running on $fuelType"

  def drive: String = s"Driving $make $model"
}
