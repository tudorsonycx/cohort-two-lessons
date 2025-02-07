// These work on monadic types like Seq, List, Option, Either, Future
// Will not work on Int, String, Boolean

// <- (backwards arrow), simply way of writing a function (flatmap, filter, map, foreach)
// yield -  call the map

// classic
def retrieveNumbers: Seq[Int] = for (number <- 1 to 10) yield number
retrieveNumbers

// use operators

def squaredNumbers: Seq[Int] = for (number <- retrieveNumbers) yield number * number
squaredNumbers

// if guards

def squaredMultiplesOfThree: Seq[Int] = for {
    number <- squaredNumbers
    if number % 3 == 0
  } yield number
squaredMultiplesOfThree

val animals: List[String] = List("Hippo", "Bear", "Seal", "Pig")

def addS(animalList: List[String]): List[String] =
  animalList.map(animal => animal + "s")

addS(animals)

def lowerCaseAnimals(animalList: List[String]): List[String] =
  animalList.map(animal => animal.toLowerCase)

lowerCaseAnimals(animals)

def lowerCaseAndAddSM(animalList: List[String]): List[String] = {
  val animalsPlurals = addS(animalList)
  lowerCaseAnimals(animalsPlurals)
}

lowerCaseAndAddSM(animals)

def lowerCaseAndAddS(animalList: List[String]): List[String] = for {
    animalsS <- addS(animalList)
    animalsLowerCase <- lowerCaseAnimals(List(animalsS))
  } yield animalsLowerCase

lowerCaseAndAddS(animals)