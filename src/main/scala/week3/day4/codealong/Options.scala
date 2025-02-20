package week3.day4.codealong

object Options extends App {
  trait Pizza {
    val size: Int
    val crust: Option[String]
  }

  object Personal extends Pizza {
    val size: Int = 7
    val crust: Option[String] = Some("classic")
  }

  object Small extends Pizza {
    val size: Int = 9
    val crust: Option[String] = None
  }

  object Medium extends Pizza {
    val size: Int = 11
    val crust: Option[String] = Some("classic")
  }

  object Large extends Pizza {
    val size: Int = 14
    val crust: Option[String] = None
  }

  val newPizzaOrder: Pizza = Large

  def whatCrust(pizza: Pizza): String = {
    pizza.crust match {
      case Some("classic") => s"Classic crust"
      case Some("italian") => s"Italian crust"
      case Some("stuffed") => s"Stuffed crust"
      case None => "Regular crust"
    }
  }

  println(whatCrust(newPizzaOrder))

  case class ChocoBar(name: String, filling: Option[String]) {
    def getFilling: String = {
      filling.getOrElse("weird unknown filling")
    }
  }
  println(ChocoBar("A", Some("caramel")).getFilling)
  println(ChocoBar("B", Some("nougat")).getFilling)
  println(ChocoBar("C", Some("nuts")).getFilling)
  println(ChocoBar("D", Some("random stuff")).getFilling)
  println(ChocoBar("E", None).getFilling)
}
