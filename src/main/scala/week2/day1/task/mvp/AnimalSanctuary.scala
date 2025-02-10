package week2.day1.task.mvp

object AnimalSanctuary extends App {
  private val bear1: Bear = Bear("Bruno", 10 * 365, "brown", isPregnant = false)

  bear1.describe()
  bear1.eat()
  bear1.sleep()
  bear1.poop()
  bear1.move()
  bear1.giveBirth()
  bear1.hunt()
  bear1.hibernate()
  println()

  private val parrot1: Parrot = Parrot("Polly", 12 * 365, "red", 25)

  parrot1.describe()
  parrot1.fly()
  parrot1.layEggs()
  parrot1.talk()
  parrot1.fly()
  parrot1.sleep()
  println()

  private val butterfly1: Butterfly = Butterfly("Butter", 5, 4, 6)

  butterfly1.describe()
  butterfly1.metamorphose()
  butterfly1.poop()
  butterfly1.fly()
}
