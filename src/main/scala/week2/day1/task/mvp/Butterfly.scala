package week2.day1.task.mvp

class Butterfly(val name: String, val age: Float, val numberOfLegs: Int, val wingSpan: Int)
  extends Insect with Flyable {

  def metamorphose(): Unit = println(s"$name is metamorphosing")
}

object Butterfly {
  def apply(name: String, age: Float, numberOfLegs: Int, wingSpan: Int) =
    new Butterfly(name, age, numberOfLegs, wingSpan)
}