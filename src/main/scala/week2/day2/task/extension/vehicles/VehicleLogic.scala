package week2.day2.task.extension.vehicles

object VehicleLogic extends App {
  val fighterJet1: FighterJet = FighterJet("Lockheed Martin", "F-22 Raptor", 2020, "Gray", 2, 2)

  val car1: Car = Car("Toyota", "Corolla", 2021, "Blue", Gasoline, 4, 4)

  val warship1: Warship = Warship("Northrop Grumman", "Zumwalt", 2016, "Gray", 2)

  val vehicles: List[Vehicle] = List(fighterJet1, car1, warship1)

  vehicles.foreach(vehicle => {
    println(vehicle.describe)
    println(vehicle.startEngine)
    println(vehicle.accelerate)
    println(vehicle.brake)
    println(vehicle.turnLeft)
    println(vehicle.turnRight)
    println(vehicle.reverse)
    println(vehicle.stopEngine)
    vehicle match {
      case car: Car =>
        val tempCar: Car = Car("BMW", "M5", 2021, "Black", Gasoline, 4, 4)
        println(car.drive)
        println(car.honk)
        println(car.park)
        println(car.race(tempCar))
        println(car.playMusic(10))
        println(car.openTrunk)
      case fighterJet: FighterJet =>
        val tempFighterJet: FighterJet = FighterJet("Boeing", "F/A-18 Super Hornet", 2020, "Gray", 2, 1)
        println(fighterJet.takeOff)
        println(fighterJet.fly)
        println(fighterJet.land)
        println(fighterJet.dogFight(tempFighterJet))
        println(fighterJet.fireMissile)
        println(fighterJet.eject)
      case warship: Warship =>
        val tempWarship: Warship = Warship("General Dynamics", "Ticonderoga", 2020, "Blue", 3)
        println(warship.sail)
        println(warship.dock)
        println(warship.fight(tempWarship))
        println(warship.fireCannons)
        println(warship.launchTorpedoes)
        val tempFighterJet: FighterJet = FighterJet("Boeing", "F/A-18 Super Hornet", 2020, "Gray", 2, 1)
        println(warship.deployFighterJet(tempFighterJet))
    }
    println()
  })

  val raceCar1: Car = Car("Ferrari", "488 GTB", 2021, "Red", Gasoline, 2, 2)
  val raceCar2: Car = Car("Lamborghini", "Huracan", 2021, "Yellow", Gasoline, 2, 2)
  val raceCar3: Car = Car("Porsche", "911 GT3", 2021, "Blue", Gasoline, 2, 2)

  val raceCar4: Car = raceCar1.copy(model = "LaFerrari")
  val raceCar5: Car = raceCar2.copy(make = "Audi", model = "R8")
  val raceCar6: Car = raceCar3.copy(color = "Black")

  val raceCar4Copy: Car = raceCar4.copy()

  // toString method is called implicitly
  println(raceCar1)
  println(raceCar2.toString)
  println(raceCar3)
  println(raceCar4)
  println(raceCar5.toString)
  println(raceCar6)
  println(raceCar4Copy)

  println(raceCar1.equals(raceCar4))
  println(raceCar2.equals(raceCar5))
  println(raceCar3.equals(raceCar6))
  println(raceCar4.equals(raceCar4Copy))

}
