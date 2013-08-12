package Chapter_09_FilesRegex.ex3

abstract class Shape(protected var _xPos: Double = 0.0, protected var _yPos: Double = 0.0) {

  def area : Double

  def moveTo(xPos: Double, yPos: Double) {
    _xPos = xPos; _yPos = yPos
  }

  override def equals(other: Any) = {
    val that = other.asInstanceOf[Shape]
    if (that == null) false
    else
      _xPos == that._xPos && _yPos == that._yPos
  }

  override def toString = "Shape: Position: (" + _xPos + ", " + _yPos + ")"
}

class Circle(_xPos: Double = 0.0,
             _yPos: Double = 0.0,
             protected var _radius: Double = 0.0) extends Shape(_xPos, _yPos) {

  def area = {
    math.Pi * math.pow(_radius, 2.0)
  }

  def circumference = {
    2.0 * math.Pi * _radius;
  }

  final override def equals(other: Any) = {
    val that = other.asInstanceOf[Circle]
    if (that == null) false
    else
      super.equals(other) && _radius == that._radius
  }

  override def toString = "Circle: Center: (" + _xPos + ", " + _yPos + ") "
}

class Rect(_xPos: Double = 0.0,
           _yPos: Double = 0.0,
           protected var _xLower: Double = 0.0,
           protected var _yLower: Double = 0.0) extends Shape(_xPos, _yPos) {

  def area = {
    (_xLower - _xPos) * (_yPos - _yLower)
  }

  override def moveTo(xPos: Double, yPos: Double) {
    _xLower += xPos - _xPos
    _yLower += yPos - _yPos
    super.moveTo(xPos, yPos)
  }

  final override def equals(other: Any) = {
    val that = other.asInstanceOf[Rect]
    if (that == null) false
    else
      super.equals(other) && _xLower == that._xLower && _yLower == that._yLower
  }

  override def toString = "Rectangle: Upper Left: (" +
    _xPos + ", " + _yPos + "). Lower Right: (" + _xLower + ", " + _yLower + ")";
}

object Main extends App {
  val circle = new Circle(1.0, 2.0, 3.0)
  println(circle)
  circle.moveTo(2.0, 1.0)
  println(circle)
  println(circle.area)

  val rect = new Rect(0.0, 1.0, 1.0, 0.0)
  println(rect)
  rect.moveTo(2.0, 3.0)
  println(rect)
  println(rect.area)
}
