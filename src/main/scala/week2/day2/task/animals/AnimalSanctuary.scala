package week2.day2.task.animals

object AnimalSanctuary extends App {
  val animals: List[Animal] = List(
    Bear("Bruno", 10 * 365, Omnivore, "brown", isPregnant = false),
    Parrot("Polly", 12 * 365, Herbivore, "red", 25),
    Mantis("Manty", 100, Carnivore, 6, 10)
  )

  private def feedAnimal(animal: Animal): Unit = {
    println(s"Feeding ${animal.name}...")
    println(animal.eat)
  }

  private def feedAllAnimals(animals: List[Animal]): Unit = {
    println("Feeding all animals...")
    animals.foreach(feedAnimal)
  }

  private def describeAllAnimals(animals: List[Animal]): Unit = animals.foreach(animal => {
    println(animal.describe)
    println(animal.sleep)
    println(animal.poop)
    println(animal.move)
    animal match {
      case bear: Bear =>
        println(bear.giveBirth)
        println(bear.hibernate)
        println(bear.hunt)
      case parrot: Parrot =>
        println(parrot.fly)
        println(parrot.layEggs)
        println(parrot.talk)
      case mantis: Mantis =>
        println(mantis.fly)
        println(mantis.layEggs)
        println(mantis.molt)
      case _ => println("Unknown animal")
    }
    println()
  })

  describeAllAnimals(animals)

  feedAllAnimals(animals)
}
