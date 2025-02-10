package week2.day1.task.mvp

class Bear(val name: String, val age: Float, val furColor: String, val isPregnant: Boolean)
  extends Mammal {

  def hibernate(): Unit = println(s"$name is hibernating")

  def hunt(): Unit = println(s"$name is hunting")
}

object Bear {
  def apply(name: String, age: Float, furColor: String, isPregnant: Boolean) =
    new Bear(name, age, furColor, isPregnant)
}