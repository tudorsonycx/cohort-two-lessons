package week2.day1.task.mvp

class Bear(val name: String, val age: Int, val furColor: String, val isPregnant: Boolean)
  extends Mammal {
  val species: String = "Ursus arctos"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (365 * 20, 365 * 30)
  val habitat = "Forests, mountains, and grasslands"

  def hibernate(): Unit = println(s"$name is hibernating")

  def hunt(): Unit = println(s"$name is hunting")
}

object Bear {
  def apply(name: String, age: Int, furColor: String, isPregnant: Boolean) =
    new Bear(name, age, furColor, isPregnant)
}