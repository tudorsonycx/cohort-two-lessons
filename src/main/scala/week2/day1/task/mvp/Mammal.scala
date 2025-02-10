package week2.day1.task.mvp

trait Mammal extends Animal {
  val furColor: String
  val isPregnant: Boolean

  def giveBirth(): Unit =
    if (isPregnant) println(s"$name is giving birth")
    else println(s"$name is not pregnant")
}
