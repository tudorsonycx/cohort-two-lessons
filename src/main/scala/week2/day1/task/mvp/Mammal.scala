package week2.day1.task.mvp

trait Mammal extends Animal {
  val furColor: String
  val isPregnant: Boolean

  def printFurColor(): Unit = println(s"Fur color: $furColor")

  def printIsPregrant(): Unit = println(s"Pregnant: $isPregnant")

  def giveBirth(): Unit =
    if (isPregnant) println(s"$name is giving birth")
    else println(s"$name is not pregnant")

  def describe(): Unit = {
    describeSpecies()
    printName()
    printAge()
    printFurColor()
    printIsPregrant()
  }
}
