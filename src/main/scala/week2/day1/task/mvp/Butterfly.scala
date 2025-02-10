package week2.day1.task.mvp

class Butterfly(val name: String, val age: Int, val numberOfLegs: Int, val wingSpan: Int)
  extends Insect with Flyable {
  val species: String = "Maniola jurtina"
  val conservationStatus: String = "Least Concern"
  val avgLifespanRange: (Int, Int) = (5, 12)
  val habitat: String = "Grasslands"

  def metamorphose(): Unit = println(s"$name is metamorphosing")
}

object Butterfly {
  def apply(name: String, age: Int, numberOfLegs: Int, wingSpan: Int) =
    new Butterfly(name, age, numberOfLegs, wingSpan)
}