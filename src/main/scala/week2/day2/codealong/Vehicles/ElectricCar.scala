package week2.day2.codealong.Vehicles

case class ElectricCar(override val make: String, override val model: String, timeToCharge: Int)
  extends Car(make, model, "battery") with Electric {
}
