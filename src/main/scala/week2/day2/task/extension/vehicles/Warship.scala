package week2.day2.task.extension.vehicles

case class Warship(make: String, model: String, year: Int, color: String, propellers: Int) extends WaterVehicle {

  def fight(opponent: Warship): String = s"The $make $model is fighting with the ${opponent.make} ${opponent.model}"

  def fireCannons: String = s"The $make $model is firing its cannons"

  def launchTorpedoes: String = s"The $make $model is launching torpedoes"

  def deployFighterJet(fighterJet: FighterJet) = s"The $make $model is deploying the ${fighterJet.make} ${fighterJet.model}"
}
