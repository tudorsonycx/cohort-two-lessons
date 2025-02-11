package week2.day2.task.animals

trait Mammal extends Animal {
  val furColor: String
  val isPregnant: Boolean

  protected def printFurColor(): Unit = println(s"Fur color: $furColor")

  protected def printIsPregnant(): Unit = println(s"Pregnant: $isPregnant")

  def giveBirth(): Unit =
    if (isPregnant) println(s"$name is giving birth")
    else println(s"$name is not pregnant")

  def describe(): Unit = {
    describeSpecies()
    printName()
    printAge()
    printDietType()
    printFurColor()
    printIsPregnant()
  }
}
