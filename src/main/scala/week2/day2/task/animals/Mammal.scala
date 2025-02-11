package week2.day2.task.animals

trait Mammal extends Animal {
  val furColor: String
  val isPregnant: Boolean

  protected def printFurColor: String = s"Fur color: $furColor"

  protected def printIsPregnant: String = s"Pregnant: $isPregnant"

  def giveBirth: String =
    if (isPregnant) s"$name is giving birth"
    else s"$name is not pregnant"

  def describe: String = {
    s"$describeSpecies\n" +
      s"$printName\n" +
      s"$printAge\n" +
      s"$printDietType\n" +
      s"$printFurColor\n" +
      s"$printIsPregnant"
  }
}
