package Chapter_06_Objects.ex4


class Point(val x: Int, val y: Int){
  override def toString = "Point("+x+", "+y+")"
}

object Point {
  def apply(x: Int, y: Int) = new Point(x, y)
}
object Main extends App{
  val withoutNew = Point(3,4)
  println(withoutNew)
}