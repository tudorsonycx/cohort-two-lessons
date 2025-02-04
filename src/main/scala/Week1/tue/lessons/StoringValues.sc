/**
 * Melons - 50p * 5
 * Apples - 10p * 2
 * Fizzy drinks - £1.2 * 6
 * Total in pence
 */

val melonsCost = 50 * 5
val applesCost = 10 * 2
val fizzyDrinksCost = 120 * 6

val totalCost = melonsCost + applesCost + fizzyDrinksCost
println(totalCost)

/**
 * Bad practice to use vars
 */
var totalCost = 0
totalCost += melonsCost + applesCost + fizzyDrinksCost
println(totalCost)

val bananasCost = 30 * 4
println(bananasCost)
// bananasCost = 35 * 4

val lemonsCost = 30 * 5
val flourCost = 90 * 2
val cidersCost = 250 * 6

val totalCost = lemonsCost + flourCost + cidersCost
println(totalCost)