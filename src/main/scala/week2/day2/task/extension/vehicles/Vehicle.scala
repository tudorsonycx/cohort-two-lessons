package week2.day2.task.extension.vehicles

trait Vehicle {
  val make: String
  val model: String
  val year: Int
  val color: String
  val fuelType: String

  def describe: String = s"This vehicle is a $make $model from $year with $color color running on $fuelType"

  def startEngine: String = s"The $make $model is starting"

  def stopEngine: String = s"The $make $model is stopping"

  def accelerate: String = s"The $make $model is accelerating"

  def brake: String = s"The $make $model is braking"

  def turnLeft: String = s"The $make $model is turning left"

  def turnRight: String = s"The $make $model is turning right"

  def reverse: String = s"The $make $model is reversing"
}
