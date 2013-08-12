package Chapter_16_XML.ex7

object Main extends App{
  def adjustToPairs(f: (Int,Int)=>Int):((Int, Int)) => Int = {
    case (x,y) => f(x, y)
  }

  val pairs = (1 to 10) zip (11 to 20)
  println("pairs  : " + pairs.mkString(" "))
  println("pairs +: " + pairs.map(adjustToPairs(_ + _)))
  println("pairs *: " + pairs.map(adjustToPairs(_ * _)))

}



