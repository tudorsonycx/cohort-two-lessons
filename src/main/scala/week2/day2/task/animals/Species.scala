package week2.day2.task.animals

trait Species {
  val species: String
  val conservationStatus: String
  // lifespan range in days
  val avgLifespanRange: (Int, Int)
  val habitat: String

  def describeSpecies: String = {
    s"Species: $species\n" +
      s"Conservation status: $conservationStatus\n" +
      f"Average lifespan: ${avgLifespanRange._1 / 365f}%.2f - ${avgLifespanRange._2 / 365f}%.2f years\n" +
      s"Habitat: $habitat"
  }
}
