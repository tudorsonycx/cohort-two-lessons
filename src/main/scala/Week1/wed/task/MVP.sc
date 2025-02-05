val watermelons: Int = 4
val hasBag: Boolean = false
var canBuy: Boolean = false
val melonCost: Double = 1.397

if (watermelons < 1) {
  println(f"John, you cannot buy $watermelons watermelons. Get out.")
} else if (watermelons < 4) {
  println(f"You can carry $watermelons watermelons in your hands.")
  canBuy = true
} else if (watermelons < 6) {
  if (hasBag) {
    println(f"You can carry $watermelons watermelons in your bag.")
    canBuy = true
  } else {
    println(f"You could carry $watermelons watermelons if you had a bag," +
      f" John. Which you don't. Get out of my store.")
  }
} else {
  var bagsNeeded: Int = watermelons / 5
  if (watermelons % 5 != 0) {
    bagsNeeded += 1
  }
  println(f"You would need $bagsNeeded bags to carry $watermelons watermelons" +
    f", John.")
  if (bagsNeeded > 2) {
    println(s"You would also need ${bagsNeeded - 2} more hand(s), assuming you" +
      s" can carry one bag in each hand.\nAre you a mutant, John? Get out," +
      s" mutant.")
  }
}

if (canBuy) {
  println(f"Total cost for $watermelons melon(s) is £${watermelons * melonCost}%.2f.")
} else {
  println(f"As we discussed, you cannot buy $watermelons melons, John. £0.00." +
    f" Out.")
}