package week2.day2.task.extension.vehicles

trait AirVehicle extends Vehicle {
  val fuelType: FuelType = JetFuel
  val wings: Int
  val engines: Int

  override def describe: String = s"${super.describe} with $wings wings and $engines engines"

  def takeOff: String = s"The $make $model is taking off"

  def land: String = s"The $make $model is landing"

  def fly: String = s"The $make $model is flying"

}
