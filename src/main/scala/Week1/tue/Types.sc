/**
 * Int - whole numbers - 4 bytes
 * Long - whole numbers - 8 bytes
 * Short - whole numbers - 2 bytes
 * Double - floating-point numbers - 8 bytes
 * Float - floating-point numbers - 4 bytes
 * String - sequence of characters
 */

val one: Int = 1
// Haven't told Scala it is an Int; it has inferred the type. Not safe
val inferredOne = 1

val anInt: Int = 2147483647
val aLong: Long = 9223372036854775807L
val aShort: Short = 32767
val aDouble: Double = 1.321
val aFloat: Float = 31.1f
val aString: String = "Simple string"