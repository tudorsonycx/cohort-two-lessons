package week2.day2.task.extension.vehicles

object VehicleLogic extends App {
  val car1: Car = new Car("Toyota", "Camry", "diesel")
  println(car1.description)
  println(car1.drive)
  println()

  val electricCar1: ElectricCar = ElectricCar("Tesla", "Model S", 5)
  println(electricCar1)
  println(electricCar1.timeToCharge)
  println(electricCar1.charge)
  println(electricCar1.drive)
}
