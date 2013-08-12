package Chapter_09_FilesRegex.ex7

class Square(x : Int, y: Int, width: Int) extends java.awt.Rectangle(x, y, width, width) {
  def this() = this(0, 0, 0)
  def this(width: Int) = this(0, 0, width)
}

object Main extends App{
  val s1 = new Square(1, 1, 3)
  println(s1)
  val s2 = new Square()
  println(s2)
  val s3 = new Square(5)
  println(s3)
}


