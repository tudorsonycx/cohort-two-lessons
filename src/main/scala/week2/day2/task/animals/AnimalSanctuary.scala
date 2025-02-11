package week2.day2.task.animals

object AnimalSanctuary extends App {
  val animals: List[Animal] = List(
    Bear("Bruno", 10 * 365, Omnivore, "brown", isPregnant = false),
    Parrot("Polly", 12 * 365, Herbivore, "red", 25),
    Mantis("Manty", 100, Carnivore, 6, 10)
  )

  private def feedAnimal(animal: Animal): Unit = {
    println(s"Feeding ${animal.name}...")
    animal.eat()
  }

  private def feedAllAnimals(animals: List[Animal]): Unit = {
    println("Feeding all animals...")
    animals.foreach(feedAnimal)
  }

  private def describeAllAnimals(animals: List[Animal]): Unit = animals.foreach(animal => {
    animal.describe()
    animal.sleep()
    animal.poop()
    animal.move()
    animal match {
      case bear: Bear =>
        bear.giveBirth()
        bear.hibernate()
        bear.hunt()
      case parrot: Parrot =>
        parrot.fly()
        parrot.layEggs()
        parrot.talk()
      case mantis: Mantis =>
        mantis.fly()
        mantis.layEggs()
        mantis.molt()
      case _ => println("Unknown animal")
    }
    println()
  })

  describeAllAnimals(animals)

  feedAllAnimals(animals)
}
