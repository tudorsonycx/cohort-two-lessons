package week2.day2.task

// 1.
// A case class has the same functionality of a normal class plus a few added features;
// it automatically generates some useful code for us:
// - case class constructor parameters are public val fields by default
// - an apply method is created so we don't need the 'new' keyword to instantiate a case class
// - conversely, an unapply method is also created which is very useful for pattern matching
// - a shallow copy method is generated allowing for easy duplication of an instance
// - equals and hashCode methods are generated, useful for comparison between instances and usage
// as keys in maps
// - a toString method is generated, helpful for debugging

object MVP extends App {
  // 2.

  // a. Compiles
  case class Person(name: String, age: Int, nationality: String, isStudent: Boolean)

  // b. Compiles
  val firstPerson = new Person("Carols", 23, "Spanish", true)

  // c. Compiles
  val secondPerson = Person("Carols", 23, "Spanish", true)

  // d. Compiles
  val thirdPerson = Person("Chloe", 25, "British", false)

  // e. Compiles
  class Animal(name: String, colour: String, pet: Boolean)

  // f. Doesn't compile - apply method not implemented
  //  val cat = Animal("cat", "black", true)

  // g. Compiles
  val dog = new Animal("dog", "white", true)

  // 3. b and e are equal

  case class Muffin(flavour: String, price: Double, storeBoughtFrom: String)

  val muffins: List[Muffin] = List(
    Muffin("chocolate", 3.5, "Mercator Bakery"), // b.
    Muffin("blueberry", 3.5, "Mercator Bakery"), // c.
    Muffin("vanilla", 3.5, "Mercator Bakery"), // d.
    Muffin("chocolate", 3.5, "Mercator Bakery"), // e.
    Muffin("Chocolate", 3.5, "Mercator Bakery"), // f.
    Muffin("choocolate", 2.5, "Mercator Bakery") // g.
  )

  def checkEqual(muffins: List[Muffin]): Unit = {
    val first: Muffin = muffins.head
    val rest: List[Muffin] = muffins.tail

    rest.foreach(muffin => {
      if (first == muffin)
        println(s"$first ${System.identityHashCode(first)} is equal to " +
          s"$muffin ${System.identityHashCode(muffin)}")
    })

    if (muffins.length > 1)
      checkEqual(rest)
  }

  checkEqual(muffins)
}
