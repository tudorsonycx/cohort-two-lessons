package week2.day1.codealong

object DogLogic extends App {

  private val dog1: Dog = Dog("Axel", 3, "Corgi", isBig = false)

  println(dog1.name)
  println(dog1.age)
  println(dog1.breed)
  dog1.bark()
  println(dog1.bigBoi)
}
