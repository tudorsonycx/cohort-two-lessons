// Apparently, if statements are expressions in Scala, and they
// always return values. Did some research and found this:
// https://docs.scala-lang.org/overviews/scala-book/if-then-else-construct.html

val a = 13
val b = 13

// The result of the if statement is assigned to a variable called whoIsBigger
// Very nice!
val whoIsBigger: String = if (a > b) {
  f"$a is bigger than $b"
} else if (a == b) {
  f"$a is equal to $b"
} else {
  f"$b is bigger than $a"
}

println(whoIsBigger)