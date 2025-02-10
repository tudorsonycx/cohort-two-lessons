package week2.day1.task.mvp

trait Species {
  val species: String
  val conservationStatus: String
  val avgLifespanRange: (Int, Int)
  val numOfYoungRange: (Int, Int)
}
