// Task 1

def getBigVal(input1: Int, input2: Int): String = {
  if (input1 > input2)
    "first"
  else if (input1 < input2)
    "second"
  else
    "same"
}

getBigVal(100, 101)
getBigVal(312, 49)
getBigVal(13, 13)

// Task 2

def nameLength(firstName: String, lastName: String): Int = {
  val firstNameLength = firstName.length
  val lastNameLength = lastName.length
  if (firstNameLength > lastNameLength)
    firstNameLength
  else if (firstNameLength < lastNameLength)
    lastNameLength
  else 0
}

nameLength("Tom", "Hiddleston")
nameLength("Elizabeth", "Olsen")
nameLength("Chris", "Pratt")