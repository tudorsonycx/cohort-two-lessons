package week3.day4.tasks

object MVP extends App {
  def getCapital(country: String): String = {
    country.trim.toLowerCase match {
      case "england" => "London"
      case "france" => "Paris"
      case "germany" => "Berlin"
      case "italy" => "Rome"
      case "spain" => "Madrid"
      case "portugal" => "Lisbon"
      case "netherlands" => "Amsterdam"
      case "belgium" => "Brussels"
      case "switzerland" => "Bern"
      case "austria" => "Vienna"
      case _ => "Unknown"
    }
  }

  private val countries: List[String] =
    List("   EnglanD", "fraNCe  ", "  Germany", "Italy", "spain", " portugal", "  NetherLANDS  ", " belgiuM", "Switzerland  ", "AUSTRIA", "Russia")

  countries.foreach(country => println(s"Capital of $country is ${getCapital(country)}"))
  println()

  sealed trait Animal

  case object Dog extends Animal

  case object Cat extends Animal

  case object Bird extends Animal

  case object Fish extends Animal

  def getAnimalFact(animal: Animal): String = {
    animal match {
      case Dog => "Dogs can smell about 1,000 times better than humans."
      case Cat => "Cats have five toes on their front paws, but only four on their back paws."
      case Bird => "The smallest bird in the world is the bee hummingbird."
      case Fish => "Fish can see in color."
    }
  }

  val animals: List[Animal] = List(Dog, Cat, Bird, Fish)

  animals.foreach(animal => println(getAnimalFact(animal)))
}
