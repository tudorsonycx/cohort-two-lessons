package week2.day1.task.mvp

trait Animal extends Species {
  val name: String
  // age in days
  val age: Int

  val dietType: DietType

  def printName(): Unit = println(s"Name: $name")

  def printAge(): Unit = println(f"Age: ${age / 365f}%.2f years")

  def printDietType(): Unit = println(s"Diet type: $dietType")

  def eat(): Unit = println(s"$name is eating")

  def sleep(): Unit = println(s"$name is sleeping")

  def poop(): Unit = println(s"$name is pooping")

  def move(): Unit = println(s"$name is moving")

  def describe(): Unit
}
