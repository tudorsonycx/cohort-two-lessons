def lowerNames(names: List[String]): List[String] =
  names.map(name => name.toLowerCase)

def capitalizeNames(names: List[String]): List[String] =
  names.map(name => name.capitalize)

val names: List[String] = List("aRIa", "BaRT", "ChUCk")

capitalizeNames(lowerNames(names))

def lowerAndCapitalizeNames(names: List[String]): List[String] = for {
  lowerName <- lowerNames(names)
  capitalizedLowerName <- capitalizeNames(List(lowerName))
} yield capitalizedLowerName

lowerAndCapitalizeNames(names)
