package week3.day4.tasks

import java.time.LocalDate

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

  case class Person private(
    fullName: String,
    dateOfBirth: LocalDate,
    occupation: Option[String],
    lastCountryLivedIn: String,
    dateOfDeath: Option[LocalDate],
    age: Int,
    starSign: String,
    ageAtDeath: Option[Int]
  )

  case class InputPerson(
    fullName: String,
    dateOfBirth: LocalDate,
    occupation: Option[String],
    lastCountryLivedIn: String,
    dateOfDeath: Option[LocalDate]
  )

  object Person {
    def createPerson(inputPerson: InputPerson): Person = {
      val age: Int = inputPerson.dateOfBirth.until(LocalDate.now()).getYears

      val month: Int = inputPerson.dateOfBirth.getMonthValue
      val day: Int = inputPerson.dateOfBirth.getDayOfMonth
      val starSign: String = {
        (month, day) match {
          case (m, d) if (m == 3 && d > 20) || (m == 4 && d < 20) => "Aries"
          case (m, d) if (m == 4 && d > 19) || (m == 5 && d < 21) => "Taurus"
          case (m, d) if (m == 5 && d > 20) || (m == 6 && d < 22) => "Gemini"
          case (m, d) if (m == 6 && d > 21) || (m == 7 && d < 23) => "Cancer"
          case (m, d) if (m == 7 && d > 22) || (m == 8 && d < 23) => "Leo"
          case (m, d) if (m == 8 && d > 22) || (m == 9 && d < 23) => "Virgo"
          case (m, d) if (m == 9 && d > 22) || (m == 10 && d < 23) => "Libra"
          case (m, d) if (m == 10 && d > 23) || (m == 11 && d < 22) => "Scorpio"
          case (m, d) if (m == 11 && d > 21) || (m == 12 && d < 22) => "Sagittarius"
          case (m, d) if (m == 12 && d > 21) || (m == 1 && d < 20) => "Capricorn"
          case (m, d) if (m == 1 && d > 19) || (m == 2 && d < 19) => "Aquarius"
          case (m, d) if (m == 2 && d > 18) || (m == 3 && d < 21) => "Pisces"
        }
      }

      val ageAtDeath: Option[Int] =
        inputPerson.dateOfDeath match {
          case Some(value) => Some(inputPerson.dateOfBirth.until(value).getYears)
          case None => None
        }

      Person(
        inputPerson.fullName,
        inputPerson.dateOfBirth,
        inputPerson.occupation,
        inputPerson.lastCountryLivedIn,
        inputPerson.dateOfDeath,
        age,
        starSign,
        ageAtDeath
      )
    }
  }

  val inputPerson: InputPerson = InputPerson(
    "John Doe",
    LocalDate.of(1990, 4, 1),
    Some("Software Engineer"),
    "England",
    Some(LocalDate.of(2025, 1, 1))
  )
  println(Person.createPerson(inputPerson))

}
