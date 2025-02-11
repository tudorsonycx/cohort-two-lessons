package week2.day2.codealong.Vehicles

trait Electric {
  val timeToCharge: Int

  def charge: String = s"Carge me for $timeToCharge hours"
}
