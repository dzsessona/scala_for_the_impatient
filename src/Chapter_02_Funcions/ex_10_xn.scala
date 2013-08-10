package Chapter_02_Funcions.ex10

object Main extends App{

  def mypowcase(x: Double, n: Int): Double = n match{
    case p if(p > 0 && p % 2 == 0) => {val y =mypowcase(x, n/2); y * y}
    case p if (p > 0) => x * mypowcase(x, n - 1)
    case p if (p == 0) => 1
    case _ => 1 / mypowcase(x, -1 * n)
  }
  println("mypowcase(4,2): " + mypowcase(4,2) )
  println("mypowcase(4,-2): " + mypowcase(4,-2) )
}
