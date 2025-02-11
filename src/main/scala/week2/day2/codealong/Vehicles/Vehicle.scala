package week2.day2.codealong.Vehicles

abstract class Vehicle(val make: String) {
  val description: String = s"This vehicle is a $make"

  def drive: String
}
