package week2.day2.task.extension.vehicles

trait WaterVehicle extends Vehicle {
  val fuelType: FuelType = BoatFuel
  val propellers: Int

  override def describe: String = s"${super.describe} with $propellers propellers"

  def sail: String = s"The $make $model is sailing"

  def dock: String = s"The $make $model is docking"
}
