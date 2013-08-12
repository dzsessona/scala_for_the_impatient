package Chapter_14_CaseClasses.ex2

object Main extends App{

  def swap[T](couple:Tuple2[T,T]):Tuple2[T,T] = couple match{
    case (x,y) => (y,x)
  }

  println("swap(43,9): " + swap(43,9))
  println("swap(\"diego\", \"zambelli\")" + swap("diego", "zambelli"))

}