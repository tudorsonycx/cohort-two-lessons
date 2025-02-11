package week2.day2.task.extension.vehicles

case class FighterJet(make: String, model: String, year: Int, color: String, wings: Int, engines: Int)
  extends AirVehicle {

  def dogFight(opponent: FighterJet): String =
    s"The $make $model is dog fighting with the ${opponent.make} ${opponent.model}"

  def fireMissile: String = s"The $make $model is firing a missile"

  def eject: String = s"The $make $model is ejecting"
}
