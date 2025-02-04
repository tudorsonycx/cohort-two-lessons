/**
 * 1. This is false, because the == operator only returns true if both operands
 * are equal. "STRING" is "less" than "string", because the character 'S' comes
 * before the character 's' on the ASCII table.
 */
"STRING" == "string"

/**
 * 2. Converting "one" to 1 is not directly possible, but theoretically possible
 * using other features of the Scala language such as pattern matching.
 */

/**
 * 3. Same as converting "one" to 1.
 */

/**
 * 4. We can convert any Int to a String using the Int.toString method. For
 * example, 1.toInt returns the "1" String. Nice!
 */

/**
 * 5. We can convert a String to uppercase using the String.toUpperCase method.
 */
val lower: String = "lowercase"
val upper: String = lower.toUpperCase

/**
 * 6. The String.capitalize method capitalizes a String
 */
val word: String = "mercator"
val capitalizedWord: String = word.capitalize