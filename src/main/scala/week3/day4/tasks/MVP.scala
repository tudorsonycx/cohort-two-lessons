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

}
