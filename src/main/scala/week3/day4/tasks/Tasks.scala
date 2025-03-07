package week3.day4.tasks

import java.time.LocalDate

object Tasks extends App {
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

  sealed trait Animal {
    val speciesName: String
  }

  case object Dog extends Animal {
    val speciesName: String = "Canis lupus familiaris"
  }

  case object Cat extends Animal {
    val speciesName: String = "Felis catus"
  }

  case object Raven extends Animal {
    val speciesName: String = "Corvus corax"
  }

  case object KillerWhale extends Animal {
    val speciesName: String = "Orcinus orca"
  }

  case object AmurLeopard extends Animal {
    val speciesName: String = "Panthera pardus orientalis"
  }

  case object JavanRhino extends Animal {
    val speciesName: String = "Rhinoceros sondaicus"
  }

  case object Vaquita extends Animal {
    val speciesName: String = "Phocoena sinus"
  }

  case object SumatranElephant extends Animal {
    val speciesName: String = "Elephas maximus sumatranus"
  }

  case object CrossRiverGorilla extends Animal {
    val speciesName: String = "Gorilla gorilla diehli"
  }

  def getAnimalFact(animal: Animal): String = {
    val criticallyEndangered: List[String] = List(
      AmurLeopard.speciesName,
      JavanRhino.speciesName,
      Vaquita.speciesName,
      SumatranElephant.speciesName,
      CrossRiverGorilla.speciesName
    )
    val fact: String = animal match {
      case Dog => "Dogs can smell about 1,000 times better than humans."
      case Cat => "Cats have five toes on their front paws, but only four on their back paws."
      case Raven => "Ravens are one of the smartest animals."
      case KillerWhale => "Killer whales are actually dolphins."
      case AmurLeopard => "Amur leopards are the rarest big cats in the world."
      case JavanRhino => "Javan rhinos are the most threatened of the five rhino species."
      case Vaquita => "Vaquitas are the most endangered marine mammal in the world."
      case SumatranElephant => "Sumatran elephants are the smallest of the Asian elephants."
      case CrossRiverGorilla => "Cross River gorillas are the most endangered of the four gorilla subspecies."
    }
    if (criticallyEndangered.contains(animal.speciesName)) {
      s"$fact This species is critically endangered."
    } else {
      fact
    }
  }

  val animals: List[Animal] =
    List(Dog, Cat, Raven, KillerWhale, AmurLeopard, JavanRhino, Vaquita, SumatranElephant, CrossRiverGorilla)

  animals.foreach(animal => println(getAnimalFact(animal)))

  println()

  case class Person private(
    fullName: String,
    dateOfBirth: LocalDate,
    occupation: Option[String],
    lastCountryLivedIn: String,
    dateOfDeath: Option[LocalDate],
    age: Int,
    zodiacSign: Person.ZodiacSign,
    ageAtDeath: Option[Int]
  ) {
    def horoscope: (Person.ZodiacSign, String) = Person.horoscope(dateOfBirth)
  }

  case class InputPerson(
    fullName: String,
    dateOfBirth: LocalDate,
    occupation: Option[String],
    lastCountryLivedIn: String,
    dateOfDeath: Option[LocalDate]
  )

  object Person {

    sealed trait ZodiacSign

    case object Aries extends ZodiacSign

    case object Taurus extends ZodiacSign

    case object Gemini extends ZodiacSign

    case object Cancer extends ZodiacSign

    case object Leo extends ZodiacSign

    case object Virgo extends ZodiacSign

    case object Libra extends ZodiacSign

    case object Scorpio extends ZodiacSign

    case object Sagittarius extends ZodiacSign

    case object Capricorn extends ZodiacSign

    case object Aquarius extends ZodiacSign

    case object Pisces extends ZodiacSign

    private def getZodiacSign(dateOfBirth: LocalDate): ZodiacSign = {
      val month: Int = dateOfBirth.getMonthValue
      val day: Int = dateOfBirth.getDayOfMonth

      (month, day) match {
        case (m, d) if (m == 3 && d > 20) || (m == 4 && d < 20) => Aries
        case (m, d) if (m == 4 && d > 19) || (m == 5 && d < 21) => Taurus
        case (m, d) if (m == 5 && d > 20) || (m == 6 && d < 22) => Gemini
        case (m, d) if (m == 6 && d > 21) || (m == 7 && d < 23) => Cancer
        case (m, d) if (m == 7 && d > 22) || (m == 8 && d < 23) => Leo
        case (m, d) if (m == 8 && d > 22) || (m == 9 && d < 23) => Virgo
        case (m, d) if (m == 9 && d > 22) || (m == 10 && d < 23) => Libra
        case (m, d) if (m == 10 && d > 23) || (m == 11 && d < 22) => Scorpio
        case (m, d) if (m == 11 && d > 21) || (m == 12 && d < 22) => Sagittarius
        case (m, d) if (m == 12 && d > 21) || (m == 1 && d < 20) => Capricorn
        case (m, d) if (m == 1 && d > 19) || (m == 2 && d < 19) => Aquarius
        case (m, d) if (m == 2 && d > 18) || (m == 3 && d < 21) => Pisces
      }
    }

    def createPerson(inputPerson: InputPerson): Person = {
      val age: Int = inputPerson.dateOfBirth.until(LocalDate.now()).getYears
      val zodiacSign: ZodiacSign = getZodiacSign(inputPerson.dateOfBirth)
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
        zodiacSign,
        ageAtDeath
      )
    }

    def apply(inputPerson: InputPerson): Person = createPerson(inputPerson)

    def horoscope(dateOfBirth: LocalDate): (ZodiacSign, String) = {
      val zodiacSign: ZodiacSign = getZodiacSign(dateOfBirth)
      zodiacSign match {
        case Aries => (Aries, "You are an Aries")
        case Taurus => (Taurus, "You are a Taurus")
        case Gemini => (Gemini, "You are a Gemini")
        case Cancer => (Cancer, "You are a Cancer")
        case Leo => (Leo, "You are a Leo")
        case Virgo => (Virgo, "You are a Virgo")
        case Libra => (Libra, "You are a Libra")
        case Scorpio => (Scorpio, "You are a Scorpio")
        case Sagittarius => (Sagittarius, "You are a Sagittarius")
        case Capricorn => (Capricorn, "You are a Capricorn")
        case Aquarius => (Aquarius, "You are an Aquarius")
        case Pisces => (Pisces, "You are a Pisces")
      }
    }
  }

  val inputPerson1: InputPerson = InputPerson(
    "John Doe",
    LocalDate.of(1990, 4, 1),
    Some("Software Engineer"),
    "England",
    Some(LocalDate.of(2025, 1, 1))
  )

  val inputPerson2: InputPerson = InputPerson(
    "Jane Doe",
    LocalDate.of(1995, 5, 1),
    None,
    "France",
    None
  )

  val person1: Person = Person(inputPerson1)
  val person2: Person = Person(inputPerson2)

  println(person1)
  println(person2)

  println(person1.horoscope)
  println(person2.horoscope)
}
