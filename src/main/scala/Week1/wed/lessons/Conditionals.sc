// if else

val weather: String = "hot"

if (weather == "hot") {
  s"It is $weather, no coat needed"
} else if (weather == "cold") {
  s"It is $weather, you need a coat"
} else {
  s"It is $weather"
}

val season: String = "summer"

if (weather.toLowerCase == "cold" || season.toLowerCase == "winter") {
  s"It is $weather, take a coat"
} else {
  "A light jacket is fine"
}