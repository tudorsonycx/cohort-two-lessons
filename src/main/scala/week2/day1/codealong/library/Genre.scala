package week2.day1.codealong.library

trait Genre {

  def enjoy: String
}

trait Fantasy extends Genre {

  override def enjoy: String = "Enjoy four fantasy book!"
}

