// 1.
val oneToNineSeq: Seq[Int] = Seq(1, 2, 3, 4, 5, 6, 7, 8, 9)

oneToNineSeq
  .filter(num => num <= 7)
  .filter(num => num <= 2 || num >= 5 && num != 6)

// 2.
val numList: List[Int] = List(3, 1, 0, 9, 4, 8, 5)

numList.tail.tail.head