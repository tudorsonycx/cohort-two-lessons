
// 1. Set(1, 2) == Set(2, 1, 1, 1) returns true, since Set is a collection of
// unordered elements
val set1: Set[Int] = Set(1, 2)
val set2: Set[Int] = Set(2, 1, 1, 2)
set1 == set2 // true

// 2. List(3, 4) == Seq(3, 4) will return true since List is a subclass of Seq
// and both of them contain the same elements in the same order
val list1: List[Int] = List(3, 4)
val seq1: Seq[Int] = Seq(3, 4)
list1 == seq1

// 3. List(5, 6) == Set(5, 6) will return false even though they contain the same
// elements. That is because they are fundamentally different types of collections
List(5, 6) == Set(5, 6)

// One workaround is to convert one of them to the type of the other
List(5, 6) == Set(5, 6).toList
List(5, 6).toSet == Set(5, 6)

// Beware. Although when comparing Sets, the order of the elements is not important,
// as soon as a Set is converted to an ordered collection, the internal order of the
// elements matter.
List(5, 6) == Set(6, 5).toList // False

