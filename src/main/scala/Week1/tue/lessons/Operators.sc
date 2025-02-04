/**
 * Arithmetic Operators
 */

val a: Int = 7
val b: Int = 11
val c: Int = 17
val d: String = "abc"

// Add
a + b
d + d

// Subtract
a - c

// Divide
c / a

// Multiply
a * b
b * c
d * 3

// Modulus
c % a
a % b

/**
 * Relational Operators
 */

// Equality
a == a
a == b
d == "abc"

// Inequality
a != a
a != b
d != "abb"

// Less than
a < b
b < a
d < "abd"
d < "aba"
// Less than or equals to
a <= a
b <= a
d <= "abc"
d <= "abb"

// Greater than
a > c
c > a
d > "aba"
d > "baa"
// Greater than or equals to
b >= b
a >= c
d >= "abc"
d >= "dbc"

/**
 * Logical Operators
 */

// Logical AND
true && true
true && false
1 > 1 && 2 < 3
10 > 19 && 3 >= 4

// Logical OR
true || false
false || true
false || false
"abc" < "abd" || "abc" > "abb"

val bool1: Boolean = (4 + 3) * 55 < 300
val bool1: Boolean = (4 + 3) * 55 < 300
val bool2: Boolean = 96 / 12 >= 8
val bool3: Boolean = "Hamster" < "Hippo"
val bool4: Boolean = 8 % 2 == 0
val bool5: Boolean = 156 / 8 < 20 && 54 / 4 < 14
