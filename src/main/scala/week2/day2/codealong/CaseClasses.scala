package week2.day2.codealong

object CaseClasses extends App {

  // Standard class
  // class SuperHero(val realName: String, val heroName: String, val weakness: String)

  // instantiated a new SuperHero object from the SuperHero class
  //  val superhero1: SuperHero = new SuperHero("Clark Kent", "Superman", "Kryptonite")

  // constructor parameters are public val by default with accessor methods
  // generated for each param
  case class SuperHero(realName: String, heroName: String, weakness: String)

  // built in apply method
  val superhero1: SuperHero = SuperHero("Clark Kent", "Superman", "Kryptonite")
  // built in shallow copy method
  val superhero2: SuperHero = superhero1.copy()

  // built in equals method; compares the field values and not the object
  // location in memory
  println(superhero1 == superhero2)
  // use the eq operator for comparing references
  println(superhero1 eq superhero2)

  // copy method can also be used to update certain fields by supplying them
  // to the copy method as named arguments
  val superhero3 = superhero2.copy(weakness = "Kryptonite2")

  println(superhero3 == superhero2)

  case class Dog(name: String, age: Int, breed: String)

  case class Cat(name: String, age: Int, breed: String)

  case class Bird(name: String, age: Int, breed: String)

  case class Kennel(name: String, dogs: List[Dog] = List(), cats: List[Cat] = List(), birds: List[Bird] = List()) {

    def addAnimal(animal: Any): Kennel = {
      animal match {
        case dog: Dog => this.copy(dogs = dogs :+ dog)
        case cat: Cat => this.copy(cats = cats :+ cat)
        case bird: Bird => this.copy(birds = birds :+ bird)
        case _ => this
      }
    }
  }

  val dogs: List[Dog] = List(
    Dog("Fido", 5, "Golden Retriever"),
    Dog("Rex", 3, "Corgi"),
    Dog("Lassie", 6, "Collie"),
    Dog("Buddy", 8, "Dachshund")
  )

  val kennel1 = Kennel("Good Doggos", dogs)

  val kennel1Copy = kennel1.copy(name = "Best Doggos")

  println(kennel1.dogs == kennel1Copy.dogs)

  val cats: List[Cat] = List(
    Cat("Whiskers", 2, "Siamese"),
    Cat("Mittens", 4, "Tabby"),
    Cat("Fluffy", 3, "Persian"),
    Cat("Boots", 1, "Calico")
  )

  val birds: List[Bird] = List(
    Bird("Polly", 1, "Parrot"),
    Bird("Tweety", 2, "Canary"),
    Bird("Pidgey", 3, "Pigeon"),
    Bird("Hedwig", 4, "Owl")
  )

  val kennelBuddies = Kennel("Cool Buddies", dogs, cats, birds)

  println(kennelBuddies)

  val kennelBuddiesUpdated = kennelBuddies
    .addAnimal(Dog("Axel", 3, "Labrador"))
    .addAnimal(Cat("Snowball", 4, "Maine Coon"))
    .addAnimal(Bird("Birb", 2, "Owl"))

  println(kennelBuddiesUpdated)
}


