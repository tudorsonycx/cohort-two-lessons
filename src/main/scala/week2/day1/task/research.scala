package week2.day1.task


abstract class Pet(name: String) {
  def speak(): Unit = println(s"$name speaks")
}

class Dog(name: String) extends Pet(name) {
  override def speak(): Unit = println(s"$name barks")
}

object EntryPoint extends App {
  val dog1: Dog = new Dog("Rex")

  dog1.speak()

  // Pet is an abstract class and can't be instantiated, just like traits
  // val pet1: Pet = new Pet("Rex")
}

/**
 * Both traits and abstract classes are used to share interfaces and fields
 * between classes. There are a few differences. First, a class can extend
 * multiple traits, but only one abstract or regular class. Second, abstract
 * classes allow specifying constructor parameters. Third, abstract classes
 * are fully interoperable with Java, meaning we can use them and any subclasses
 * directly from Java.
 * In my opinion, traits should be used in 99% of the cases, unless we want to
 * call our Scala code from Java.
 */
