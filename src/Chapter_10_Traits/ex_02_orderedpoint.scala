package Chapter_10_Traits.ex2

import java.awt.Point
import scala.math.Ordered

  class OrderedPoint(x: Int, y: Int) extends Point(x, y) with Ordered[Point] {
    def compare(that: Point) = {
      if (x < that.x || (x == that.x && y < that.y))          -1
      else if (x > that.x || (x == that.x && y > that.y))         1
      else                                                       0
    }
  }


object Main extends App {

  val op1 = new OrderedPoint(5, 10)
  val op2 = new OrderedPoint(10, 5)

  println("op1: new OrderedPoint(5, 10)" )
  println("op1: new OrderedPoint(10, 5)" )
  print ("op1 < op2 : " + (op1 < op2))
}