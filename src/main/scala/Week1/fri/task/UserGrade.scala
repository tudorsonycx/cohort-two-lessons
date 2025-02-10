package week1.fri.task

import scala.io.StdIn.readLine

object UserGrade extends App {

  private val subjects: List[String] = List("Math", "Science", "English")

  private def getScoresMap(subjects: List[String]): Map[String, Int] = {
    subjects.map(subject => {
      val score: Int = readLine(s"Enter score for $subject: ").toInt match {
        case s if s < 0 => 0
        case s if s > 100 => 100
        case s => s
      }
      (subject, score)
    }).toMap
  }

  def getAverageScore(scores: Map[String, Int]): Int = {
    val scoresValues = scores.values
    scoresValues.sum / scoresValues.size
  }

  def getGrade(totalScore: Int): String = {
    if (totalScore < 60) "E"
    else if (totalScore < 70) "D"
    else if (totalScore < 80) "C"
    else if (totalScore < 90) "B"
    else "A"
  }

  private val scores: Map[String, Int] = getScoresMap(subjects)
  println(s"Your scores: $scores")

  private val averageScore: Int = getAverageScore(scores)
  println(s"Your average score is $averageScore")

  private val grade: String = getGrade(averageScore)
  println(s"Your grade is $grade")
}