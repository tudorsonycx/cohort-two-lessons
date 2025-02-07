// 1.

def getSquare(num: Int): Int = num * num

getSquare(9)

// 2.

def isOdd(num: Int): Boolean = num % 2 != 0

isOdd(3)
isOdd(2)

// 3.

val numbers: List[Int] = List(2, -3, 13, -19, 10, 20, -2, -20, -18, 13)


def sumOfOddNumbers(numbers: List[Int]): Int = {
  val oddSquaredNumbers: List[Int] =
    for {
      squaredNumber <- numbers.map(num => getSquare(num))
      if isOdd(squaredNumber)
    } yield squaredNumber
  oddSquaredNumbers.sum
}

sumOfOddNumbers(numbers)

// Alternative:

def sumOfOddNumbersAlt(number: List[Int]): Int =
  numbers.map(num => getSquare(num)).filter(num => isOdd(num)).sum

sumOfOddNumbersAlt(numbers) == sumOfOddNumbers(numbers)

// 4.

def getAverageScore(scores: Map[String, Int]): Int = {
  val validScores = scores.values.map(num =>
    if (num < 0) 0
    else if (num > 100) 100
    else num
  )
  validScores.sum / validScores.size
}

def getGrade(totalScore: Int): String =
  if (totalScore < 60) "E"
  else if (totalScore < 70) "D"
  else if (totalScore < 80) "C"
  else if (totalScore < 90) "B"
  else "A"

val scores: Map[String, Int] = Map(
  "Maths" -> 90,
  "Gibberish" -> 19293,
  "Gibberish 2" -> -123919,
  "Science" -> 90,
  "English" -> 90
)

val averageScore: Int = getAverageScore(scores)

getGrade(averageScore)