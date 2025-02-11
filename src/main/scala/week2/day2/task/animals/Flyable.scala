package week2.day2.task.animals

trait Flyable {
  // wing span in cm
  val wingSpan: Int

  protected def printWingSpan: String = s"Wing span: $wingSpan cm"

  def fly: String
}

trait Bird extends Animal with Flyable {
  val feathersColor: String

  protected def printFeathersColor: String = s"Feathers color: $feathersColor"

  def fly: String = s"$name is flying"

  def layEggs: String = s"$name is laying eggs"

  def describe: String = {
    s"$describeSpecies\n" +
      s"$printName\n" +
      s"$printAge\n" +
      s"$printDietType\n" +
      s"$printFeathersColor\n" +
      s"$printWingSpan"
  }
}

trait Insect extends Animal with Flyable {
  val numberOfLegs: Int

  protected def printNumberOfLegs: String = s"Number of legs: $numberOfLegs"

  def fly: String = s"$name is flying"

  def layEggs: String = s"$name is laying eggs"

  def describe: String = {
    s"$describeSpecies\n" +
      s"$printName\n" +
      s"$printAge\n" +
      s"$printDietType\n" +
      s"$printNumberOfLegs\n" +
      s"$printWingSpan"
  }
}
