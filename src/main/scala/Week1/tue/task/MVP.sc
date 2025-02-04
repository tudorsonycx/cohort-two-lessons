/**
 * 1.
 */

// a
val aInt1: Int = 3
val aInt2: Int = 4
val aInt3: Int = 57

val aBool: Boolean = (aInt1 + aInt2) * (aInt3) < 300

// b
val bInt1: Int = 144
val bInt2: Int = 12

val bBool: Boolean = bInt1 / bInt2 >= 12

// c
val cString1: String = "Cat"
val cString2: String = "Dog"

// True since C comes before D in the ASCII table
val cBool: Boolean = cString1 < cString2

// d
val dString1: String = "Rabbit"
val dString2: String = "Hamster"

// False. R comes after H
val dBool: Boolean = dString1 < dString2

// e
val eInt: Int = 17

val eBool: Boolean = eInt % 2 != 0

// f
val fInt1: Int = 75
val fInt2: Int = 9
val fInt3: Int = 89
val fInt4: Int = 6

val fBool: Boolean = fInt1 / fInt2 < 30 && fInt3 / fInt4 < 20

/**
 * 2.
 * The difference between a String and println, is that the former is a data
 * type, and the latter is a function that outputs text to the console
 */

/**
 * 3.
 * Coming from Python, not being able to use logical operators between data
 * types other than Boolean is a bit weird! Ex: false || 3 -> returns 3 in
 * Python. 3 && "" returns "" in Python. 0 && 10 returns 0 in Python, etc.
 * Also, operators are just methods in Scala, and can be called with dot-notation,
 * which is cool:
 * val a: Int = 3
 * a.*(3) -> 9
 * a.<(4) -> true
 * false.||(true) -> true
 */