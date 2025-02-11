package week2.day2.task.animals

trait Species {
  val species: String
  val conservationStatus: String
  // lifespan range in days
  val avgLifespanRange: (Int, Int)
  val habitat: String

  def describeSpecies(): Unit = {
    println(s"Species: $species")
    println(s"Conservation status: $conservationStatus")
    println(f"Average lifespan: ${avgLifespanRange._1 / 365f}%.2f - ${avgLifespanRange._2 / 365f}%.2f years")
    println(s"Habitat: $habitat")
  }
}
