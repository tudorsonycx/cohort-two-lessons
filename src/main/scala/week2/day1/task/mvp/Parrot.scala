package week2.day1.task.mvp

class Parrot(val name: String, val age: Float, val feathersColor: String, val wingSpan: Int)
  extends Bird with Flyable {

  def talk(): Unit = println(s"$name is talking")
}

object Parrot {
  def apply(name: String, age: Float, feathersColor: String, wingSpan: Int) =
    new Parrot(name, age, feathersColor, wingSpan)
}