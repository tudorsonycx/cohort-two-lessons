package week2.day1.task.mvp

trait Animal extends Species {
  val name: String
  // age in years
  val age: Float

  def eat(): Unit = println(s"$name is eating")

  def sleep(): Unit = println(s"$name is sleeping")

  def poop(): Unit = println(s"$name is pooping")

  def move(): Unit = println(s"$name is moving")
}
