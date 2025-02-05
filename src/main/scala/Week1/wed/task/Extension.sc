/**
 * 1. Indeed, there is an operator precedence in Scala, as well as in pretty much
 * all the other programming languages out there. In Scala, the order is:
 * (characters not shown below)
 * * / %
 * + -
 * :
 * < >
 * = !
 * &
 * ^
 * |
 * (all letters, $, _)
 *
 * The list can be found here: https://docs.scala-lang.org/tour/operators.html
 */

// 2. This returns true since the && operation is evaluated first
true || false && false

// 3. This returns false since the || operation inside the brackets
// is evaluated first
(true || false) && false

// 4. First, the arithmetic operations are taken care of:
// 9 + 10 -> 19
// Then, relational operations, in this order:
// 1 < 4 -> true, 7 != 10 -> true, 19 == 21 -> false
// then the logical operations, in this order:
// true && true -> true, true || false -> true
// final result: true
// brackets for clarity: ((1 < 4) && (7 != 10)) || ((9 + 10) == 21)
1 < 4 && 7 != 10 || 9 + 10 == 21