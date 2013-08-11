package Chapter_06_Objects.ex3

class Time(private var h: Int = 0, private var m: Int = 0) {
  def hours = h
  def minutes = m
  def before(other: Time) = h * 60 + m < other.h * 60 + other.m
}

object Main extends App{
  val time = new Time(1, 30)
  println("Time is: " + time.hours + ":" + time.minutes)
  println("before 2:30 -> " + time.before(new Time(2, 30)))
  println("before 1:10 -> " + time.before(new Time(1, 10)))
}
