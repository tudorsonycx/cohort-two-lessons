// Function literals / Anonymous functions

(number: Int) => number + 1
val incrementByOneF = (number: Int) => number + 1
incrementByOneF(3)

val incrementByTwo: Int => Int = number => number + 2
incrementByTwo(2)

// Methods. Similar to functions, but must be named

def incrementByOne(number: Int): Int = number + 1
incrementByOne(3)

// The result of the last expression in a function's body is the value that the
// function will return

val aValue: Boolean = 2 < 3
def aDifferentValue: Int = {
  if (aValue) 564 else 1923
  420 // this will be returned
}
aDifferentValue

def makeACoffee: String = {
  "Add coffee to boiling water"
  "Add sugar or/and milk if required"
  "Stir"
  "Enjoy!"
}

makeACoffee

def makeATea(sugar: Int, splashesOfMilk: Int): String = {
  s"Add boiling water to your cup with a teabag, add $sugar spoons of sugar, " +
    s"and $splashesOfMilk splashes of milk, stir and enjoy!"
}

makeATea(3, 4)
// We can invoke the method by explicitly mentioning the names of the parameters
makeATea(splashesOfMilk = 3, sugar = 4)

val vat: Double = 1.2

def priceInVat(priceOfItem: Double): Double = priceOfItem * vat

priceInVat(13.61)