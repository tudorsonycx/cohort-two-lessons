package week2.day1.task.mvp

trait Flyable {
  // wing span in cm
  val wingSpan: Int

  def fly(): Unit
}

trait Bird extends Animal with Flyable {
  val feathersColor: String

  def fly(): Unit = println(s"$name is flying")

  def layEggs(): Unit = println(s"$name is laying eggs")

}

trait Insect extends Animal with Flyable {
  val numberOfLegs: Int

  def fly(): Unit = println(s"$name is flying")

  def layEggs(): Unit = println(s"$name is laying eggs")
}
