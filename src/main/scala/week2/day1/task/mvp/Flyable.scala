package week2.day1.task.mvp

trait Flyable {
  // wing span in cm
  val wingSpan: Int

  def printWingSpan(): Unit = println(s"Wing span: $wingSpan cm")

  def fly(): Unit
}

trait Bird extends Animal with Flyable {
  val feathersColor: String

  def printFeathersColor(): Unit = println(s"Feathers color: $feathersColor")

  def fly(): Unit = println(s"$name is flying")

  def layEggs(): Unit = println(s"$name is laying eggs")

  def describe(): Unit = {
    describeSpecies()
    printName()
    printAge()
    printDietType()
    printFeathersColor()
    printWingSpan()
  }
}

trait Insect extends Animal with Flyable {
  val numberOfLegs: Int

  def printNumberOfLegs(): Unit = println(s"Number of legs: $numberOfLegs")

  def fly(): Unit = println(s"$name is flying")

  def layEggs(): Unit = println(s"$name is laying eggs")

  def describe(): Unit = {
    describeSpecies()
    printName()
    printAge()
    printDietType()
    printNumberOfLegs()
    printWingSpan()
  }
}
