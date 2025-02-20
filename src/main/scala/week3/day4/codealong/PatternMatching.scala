package week3.day4.codealong

object PatternMatching extends App {
  val weather: String = "Cold"

  if (weather == "cold") {
    println(s"It is $weather! Take a coat.")
  } else if (weather == "raining") {
    println(s"It is $weather! Take an umbrella.")
  } else {
    println(s"$weather is not valid")
  }

  weather.toLowerCase match {
    case "cold" => println(s"It is $weather! Take a coat.")
    case "raining" => println(s"It is $weather! Take an umbrella.")
    case _ => println(s"$weather is not valid")
  }

  private val numOfWatermelons: Int = 6
  numOfWatermelons match {
    case 1 | 2 | 3 => println(s"John can carry $numOfWatermelons without a bag")
    case 4 | 5 => println(s"John needs a bag to carry $numOfWatermelons")
    case _ => println(s"$numOfWatermelons is invalid")
  }

  abstract class Notification

  case class Email(sender: String, title: String, body: String) extends Notification

  case class Text(sender: String, body: String) extends Notification

  case class VoiceNote(sender: String, lengthOfBody: Int) extends Notification

  val notification: Notification = Text("Mom", "Where are you?")

  val description = notification match {
    case Email(sender, title, body) => s"Email from $sender"
    case Text(sender, body) if sender.toLowerCase == "mom" => s"Text from $sender. Message: $body"
    case Text(sender, body) => s"Text from $sender"
    case VoiceNote(sender, lengthOfBody) => s"Voice note from $sender. Length: $lengthOfBody"
  }

  println(description)

  sealed trait PizzaSize

  case object MediumPizza extends PizzaSize

  case object SmallPizza extends PizzaSize

  case object LargePizza extends PizzaSize

  sealed trait PizzaCrust

  case object StuffedCrust extends PizzaCrust

  case object NormalCrust extends PizzaCrust

  case class Pizza(size: PizzaSize, crust: PizzaCrust)

  val pizza1: Pizza = Pizza(SmallPizza, NormalCrust)
  val pizza2: Pizza = Pizza(MediumPizza, NormalCrust)
  val pizza3: Pizza = Pizza(LargePizza, StuffedCrust)

  val pizzas: List[Pizza] = List(pizza1, pizza2, pizza3)

  pizzas.foreach(pizza => pizza match {
    case Pizza(SmallPizza, NormalCrust) => println("Small pizza with normal crust")
    case Pizza(MediumPizza, NormalCrust) => println("Medium pizza with normal crust")
    case Pizza(LargePizza, StuffedCrust) => println("Large pizza with stuffed crust")
  })

}
