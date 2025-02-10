package week2.day1.codealong.library

import week2.day1.codealong.family.Adult

class Book(val title: String, val author: Adult)
  extends ReadingFormat
    with Fantasy {

  def read: String = "Keep turning those pages!"
}

object Book {

  def apply(title: String, author: Adult) = new Book(title, author)
}
