package week2.day1.task.mvp

object AnimalSanctuary extends App {
  private val bear1 = Bear("Bruno", 10f, "brown", isPregnant = false)

  println(bear1.name)
  println(bear1.age)
  println(bear1.furColor)
  println(bear1.isPregnant)
  bear1.eat()
  bear1.sleep()
  bear1.poop()
  bear1.move()
  bear1.giveBirth()
  bear1.hunt()
  bear1.hibernate()
  println()

  private val parrot1 = Parrot("Polly", 3f, "red", 25)

  println(parrot1.name)
  parrot1.fly()
  parrot1.layEggs()
  parrot1.talk()
  parrot1.fly()
  parrot1.sleep()
  println()

  private val butterfly1 = Butterfly("Butter",0.1f, 4, 6)

  println(butterfly1.name)
  println(s"${butterfly1.numberOfLegs} legs")
  butterfly1.metamorphose()
  butterfly1.poop()
  butterfly1.fly()
}
