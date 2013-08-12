package Chapter_14_CaseClasses.ex5

object Main extends App{

  def sumList(list:List[Any]): Int ={
    val allsums = for(x <- list) yield x match{
      case l:List[Int] => sumList(l)
      case x:Int => x
      case _ => 0
    }
    allsums.sum
  }

  val x = List(List(3, 8), 2, List(5))
  println("x: " + x)
  println("sumList(x): " + sumList(x))

}

