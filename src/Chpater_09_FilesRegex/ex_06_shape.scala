package Chapter_09_FilesRegex.ex6

import Chapter_08_Inheritance.ex5.Point

abstract class Shape(){
  def centerPoint():Point
  override def toString =  "%s(Center: %s)".format(this.getClass.getSimpleName, centerPoint.toString)
}
class Rectangle(val topLeft:Point, val bottomRight:Point) extends Shape{
  def centerPoint():Point = {new Point((bottomRight.x - topLeft.x)/2,(bottomRight.y - topLeft.y)/2)}
}
//class Circle(val center:Point, val radius:Int) extends Shape {
//  def centerPoint():Point = center
//}
// again, a val can override a def
class Circle(val centerPoint:Point,val radius:Int)extends Shape

object Main extends App{
  val r = new Rectangle(new Point(0,0), new Point(10, 10))
  println(r)
  val c = new Circle(new Point(7, 7), 10)
  println(c)
}
