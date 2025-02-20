package week3.day4.codealong

object EnumsLogic extends App {

  object Weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  println()
  println(Weekday.values)
  println(Weekday.Sunday)

  object BetterWeekday extends Enumeration {
    val Monday = Value("Mon")
    val Tuesday = Value("Tue")
    val Wednesday = Value("Wed")
    val Thursday = Value("Thu")
    val Friday = Value("Fri")
    val Saturday = Value("Sat")
    val Sunday = Value("Sun")
  }

  println(BetterWeekday.values)
  println(BetterWeekday.Sunday)

  object ReorderedWeekday extends Enumeration {
    val Monday = Value(6)
    val Tuesday = Value(1)
    val Wednesday = Value(2)
    val Thursday = Value(3)
    val Friday = Value(4)
    val Saturday = Value(5)
    val Sunday = Value(0)
  }

  println(ReorderedWeekday.values)

  // Sealed case objects - preferred way
  sealed trait Weekday

  case object Monday extends Weekday

  case object Tuesday extends Weekday

  case object Wednesday extends Weekday

  case object Thursday extends Weekday

  case object Friday extends Weekday

  case object Saturday extends Weekday

  case object Sunday extends Weekday

  // Custom errors
  abstract class Error(val name: String, val errorCode: Int)

  case object NotFound extends Error("Not found", 404)

  case object HairColourError extends Error("Not found", 404)
}
