// Seq, List, Map

val firstSeq: Seq[Int] = Seq(1, 2, 3, 4, 5)
val firstList: List[Int] = List(1, 2, 3, 4, 5)
val firstMap: Map[String, Int] = Map(
  "one" -> 1,
  "two" -> 2,
  "three" -> 3,
  "four" -> 4,
  "five" -> 5
)

// Accessing data

// Seq
val getFirstSeqElement1: Int = firstSeq(0)
val getFirstSeqHead: Int = firstSeq.head
val getFirstSeqTail: Seq[Int] = firstSeq.tail
val getFirstSeqElement2: Int = firstSeq(1)
//val getFirstSeqOutOfBoundsElement: Int = firstSeq(firstSeq.length)

// List
val getFirstListElement1: Int = firstList(0)
val getFirstListTail: List[Int] = firstList.tail
val getFirstListLastElement: Int = firstList.last

// Map
val getFirstMapData = firstMap("three")

// Manipulating data - using map

val tripledList: List[Int] = firstList.map {
  number => number * 3
}

// bad practice to not name your data type
val tripledSeq: Seq[Int] = firstSeq.map {
  _ * 3
}

val mapChangeValue: Map[String, Int] = firstMap.map {
  case (key, value) => (key, value * 3)
}

val mapChangeKey: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value)
}

val mapChangeKeyAndValue: Map[String, Int] = firstMap.map {
  case (key, value) => (key.capitalize, value * 4)
}

// Manipulating data - using filter

val myFilter = (x: Int) => x % 2 == 0

val filteredSeq: Seq[Int] = firstSeq.filter(myFilter)

val filteredList: List[Int] = firstList.filter(myFilter)

// ._1 key, ._2 value
val filteredMap: Map[String, Int] = firstMap.filter(
  number => number._2 >= 2
)

val filteredNotSeq: Seq[Int] = firstSeq.filterNot(myFilter)

val filteredNotList: List[Int] = firstList.filterNot(myFilter)

// Manipulating data - check if an element exists in collection using exists

val existsSeq: Boolean = firstSeq.exists(number => number >= 5)

val existsList: Boolean = firstList.exists(number => number <= 0)

val existsMap: Boolean = firstMap.exists(number => number._2 >= 3)

// Manipulating data - check if a collection contains an element using contains

val containsSeq: Boolean = firstSeq.contains(7)

val containsList: Boolean = firstList.contains(3)

val containsMap: Boolean = firstMap.contains("two")
val containsMap: Boolean = firstMap.contains("six")

val containsOrSeq: Boolean = firstSeq.contains(7) || firstSeq.contains(3)