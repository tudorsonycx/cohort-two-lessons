// 1.
val percentage: Int = -1
if (percentage < 0) {
  "How is that even possible. G"
} else if (percentage < 50) {
  "F"
} else if (percentage < 60) {
  "E"
} else if (percentage < 70) {
  "D"
} else if (percentage < 80) {
  "C"
} else if (percentage < 90) {
  "B"
} else {
  "A"
}

// 2.
val age: Int = 14

if (age < 4) {
  "Take a nap, bud"
} else if (age < 8) {
  "U"
} else if (age < 12) {
  "U, PG"
} else if (age < 15) {
  "U, PG, 12A"
} else if (age < 18) {
  "U, PG, 12A, 15"
} else if (age < 100) {
  "U, PG, 12A, 15, 18"
} else {
  "The Mummy"
}