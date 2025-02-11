package week2.day2.task.extension.vehicles

sealed trait FuelType

case object Gasoline extends FuelType

case object Diesel extends FuelType

case object Battery extends FuelType

case object JetFuel extends FuelType

case object BoatFuel extends FuelType
