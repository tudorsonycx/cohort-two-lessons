package week2.day1.task.mvp

sealed trait DietType

case object Omnivore extends DietType

case object Carnivore extends DietType

case object Herbivore extends DietType
