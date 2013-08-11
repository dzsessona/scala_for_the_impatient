package Chapter_06_Objects.ex8

object RGBCube extends Enumeration {
  val BLACK = Value(0x000000, "Black")
  val RED = Value(0xff0000, "Red")
  val GREEN = Value(0x00ff00, "Green")
  val BLUE = Value(0x0000ff, "Blue")
  val YELLOW = Value(0xffff00, "Yellow")
  val MAGENTA = Value(0xff00ff, "Magenta")
  val CYAN = Value(0x00ffff, "Cyan")
  val WHITE = Value(0xffffff, "White")
}

object Main extends App{
  for( cval <- RGBCube.values ) println("0x%06x: %s".format(cval.id, cval))
}
