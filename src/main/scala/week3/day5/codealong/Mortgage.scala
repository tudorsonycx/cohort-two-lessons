package week3.day5.codealong

object Mortgage extends App {

  def isSalaryEnough(salary: Double, purchasePrice: Double): Boolean = {
    if (salary * 4 >= purchasePrice) true else false
  }

  def isDepositEnough(deposit: Double, purchasePrice: Double): Boolean = {
    if (purchasePrice * 0.1 <= deposit) true else false
  }

  def isCreditScoreEnough(creditScore: Int): Boolean = {
    if (creditScore >= 550) true else false
  }

  def canGetMortgage(salary: Double, deposit: Double, creditScore: Int, purchasePrice: Double): Boolean = {
    if (
      isSalaryEnough(salary, purchasePrice) &&
        isDepositEnough(deposit, purchasePrice) &&
        isCreditScoreEnough(creditScore)
    ) true else false
  }

  def getMaxMortgage(salary: Double, deposit: Double, creditScore: Int, purchasePrice: Double): Either[String, Double] = {
    if (canGetMortgage(salary, deposit, creditScore, purchasePrice)) {
      Right(4 * salary)
    } else {
      Left("Error")
    }
  }

  println(getMaxMortgage(45000, 20000, 577, 280000))
}
