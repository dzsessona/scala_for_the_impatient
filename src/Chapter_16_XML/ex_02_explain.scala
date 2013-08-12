package Chapter_16_XML.ex2

object Main extends App {
  // Or we could have used math.max...
  def max(x: Int, y: Int) : Int = {
    if (x > y) x
    else y
  }

  val array = Array(1, 200, 3, 77, 7, 2, 3, 10, 100)
  println("array: " + array.mkString(" "))
  println("max: " + array.reduceLeft(max))
}