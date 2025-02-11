package week2.day2.task.animals

trait Animal extends Species {
  val name: String
  // age in days
  val age: Int

  val dietType: DietType

  protected def printName: String = s"Name: $name"

  protected def printAge: String = f"Age: ${age / 365f}%.2f years"

  protected def printDietType: String = s"Diet type: $dietType"

  def eat: String = s"$name is eating"

  def sleep: String = s"$name is sleeping"

  def poop: String = s"$name is pooping"

  def move: String = s"$name is moving"

  def describe: String
}
