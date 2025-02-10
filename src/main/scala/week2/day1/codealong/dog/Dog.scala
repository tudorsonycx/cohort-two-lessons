package week2.day1.codealong.dog

class Dog(val name: String, val age: Int, val breed: String, val isBig: Boolean) {

  def bark(): Unit = println(s"$name is barking!")

  def bigBoi: String =
    if (isBig) s"$name is a big boi!" else s"$name is not a very big boi!"
}

object Dog {

  def apply(name: String, age: Int, breed: String, isBig: Boolean): Dog =
    new Dog(name, age, breed, isBig)
}
