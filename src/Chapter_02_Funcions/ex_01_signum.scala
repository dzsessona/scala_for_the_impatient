package Chapter_02_Funcions.ex1

object Main extends App{

  def signum(n:Int): Int = n match{
    case 0 => 0
    case x if x<0 => -1
    case _ => 1
  }

  println("signum(0): " +signum(0))
  println("signum(-45): " +signum(-45))
  println("signum(789): " +signum(789))
}
