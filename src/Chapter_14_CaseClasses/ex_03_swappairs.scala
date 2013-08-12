package Chapter_14_CaseClasses.ex3

object Main extends App{

  def swap(arr: Array[Int]) :Array[Int] = arr match{
    case Array(x, y) => Array(y, x)
    case Array(x, y, rest @ _*) => Array(y, x) ++ rest
    case _ => arr
    // matched by _
    //case Array() => arr
    //case Array(x) => arr
  }

  println("swap(Array(1))" + swap(Array(1)).mkString(" "))
  println("swap(Array(1,2))" + swap(Array(1,2)).mkString(" "))
  println("swap(Array(1,2,3))" + swap(Array(1,2,3)).mkString(" "))
  //println(swap(Nil))
}
