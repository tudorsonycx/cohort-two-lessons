package week3.day4.codealong

object EnumsLogic extends App {

  private object Weekday extends Enumeration {
    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  println()
  println(Weekday.values)
  println(Weekday.Sunday)

  private object BetterWeekday extends Enumeration {
    val Monday: Value = Value("Mon")
    val Tuesday: Value = Value("Tue")
    val Wednesday: Value = Value("Wed")
    val Thursday: Value = Value("Thu")
    val Friday: Value = Value("Fri")
    val Saturday: Value = Value("Sat")
    val Sunday: Value = Value("Sun")
  }

  println(BetterWeekday.values)
  println(BetterWeekday.Sunday)

  private object ReorderedWeekday extends Enumeration {
    val Monday: Value = Value(6)
    val Tuesday: Value = Value(1)
    val Wednesday: Value = Value(2)
    val Thursday: Value = Value(3)
    val Friday: Value = Value(4)
    val Saturday: Value = Value(5)
    val Sunday: Value = Value(0)
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
