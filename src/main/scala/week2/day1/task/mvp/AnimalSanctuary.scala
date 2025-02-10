package week2.day1.task.mvp

object AnimalSanctuary extends App {
  private val bear1: Bear = Bear("Bruno", 10 * 365, Omnivore, "brown", isPregnant = false)

  bear1.describe()
  bear1.eat()
  bear1.sleep()
  bear1.poop()
  bear1.move()
  bear1.giveBirth()
  bear1.hunt()
  bear1.hibernate()
  println()

  private val parrot1: Parrot = Parrot("Polly", 12 * 365, Herbivore, "red", 25)

  parrot1.describe()
  parrot1.fly()
  parrot1.layEggs()
  parrot1.talk()
  parrot1.fly()
  parrot1.sleep()
  println()

  private val mantis1: Mantis = Mantis("Manty", 100, Carnivore, 6, 10)

  mantis1.describe()
  mantis1.fly()
  mantis1.molt()
  mantis1.eat()
  mantis1.sleep()
}
