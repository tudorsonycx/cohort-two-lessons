// 1.
val oneToFiveList: List[Int] = List(1, 2, 3, 4, 5)

val primaryColorsSeq: Seq[String] = Seq("red", "yellow", "blue")

val noBlueSeq: Seq[String] = primaryColorsSeq.filter(color => color.toLowerCase != "blue")

val hasOrange: Boolean = primaryColorsSeq.contains("Orange")

// 2.
val oneToFiveParityList: List[Boolean] = oneToFiveList.map(num => num % 2 != 0)

// 3.
val petsMap: Map[String, String] = Map(
  "Luna" -> "Dog",
  "Milo" -> "Dog",
  "Max" -> "Cat",
  "Nemo" -> "Fish"
)

val dogNamesList = petsMap.filter(pet => pet._2 == "Dog").keys.toList
