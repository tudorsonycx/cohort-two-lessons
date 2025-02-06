val nameSeq: Seq[String] = Seq("Scooby", "Shaggy", "Fred", "Daphne", "Velma")

val colorMap: Map[Int, String] = Map(
  1 -> "red",
  2 -> "yellow",
  3 -> "blue",
  4 -> "green"
)

val colorMapBlue: Map[Int, String] = colorMap.filter(
  element => element._2.toLowerCase == "blue"
)

val intSeq: Seq[Int] = Seq(1, 0, 9, -12, 9, 4, 12, 37)

val intSeqIncremented: Seq[Int] = intSeq.map(num => num + 1)

val intSeqIncrementedOdds: Seq[Int] = intSeq.filter(num => num % 2 != 0)

val hasStringWithRNameSeq: Boolean = nameSeq.exists(
  str => str.toLowerCase.contains('r')
)

val flatMappedNameSeq = nameSeq.flatMap(name => name + "!")

val intSet: Set[Int] = Set(1, 3, 2, 1)

val hasThree = intSet(3)