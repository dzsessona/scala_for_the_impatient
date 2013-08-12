package Chapter_10_Traits.ex1

object Main extends App {
  trait RectangleLike extends java.awt.geom.Ellipse2D.Double {

    def translate(x: Int, y: Int) {
      this.x += x
      this.y += y
    }

    def grow(width: Int, height: Int) {
      this.width += width
      this.height += height
    }

    override def toString():String ={
      "RectangleLike [x: "+this.x+" y: "+this.y+" width: " +this.getWidth + " heigth: " + this.getHeight+" ]"
    }
  }

  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  println("original egg             "+egg)
  egg.translate(10, -10)
  println("after translate 10, -10: " + egg)
  egg.grow(10, 20)
  println("after grow 10, 20:       " +egg)
}
