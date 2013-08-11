package Chapter_06_Objects.ex4


class TimeFomrMindnight(hrs:Int, mins:Int) {
  private val totalMins: Int = (hrs * 60) + mins
  def hours = totalMins / 60
  def minutes = totalMins % 60

  def before(other: TimeFomrMindnight) :Boolean ={
    if (totalMins > other.totalMins) true
    else false
  }
}

object Main extends App {
  val time1 = new TimeFomrMindnight(1,30)
  val time2 = new TimeFomrMindnight(6,0)
  println("\nUsing time from midnight:")
  println("1:30 after  6:00 -> " + time1.before(time2))
  println("1:30 before 6:00 -> " + time2.before(time1))
}
