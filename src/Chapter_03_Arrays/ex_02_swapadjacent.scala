package Chapter_03_Arrays.ex2

import Chapter_03_Arrays.ex1.Main.populateRandArray

object Main extends App{

  def swapAdjacent(arr: Array[Int]): Array[Int] = {
    val tmp =for(i <- 0 until arr.length) yield i match{
      case n if(n % 2 ==0 && arr.length == i + 1) => arr(i)
      case n if(n % 2 ==0) => arr(i+1)
      case _ => arr(i-1)
    }
    tmp.toArray
  }

  val testArray = populateRandArray(7)
  println("array (passing 7): " +testArray.mkString(" "))
  println("after swapping   : " +swapAdjacent(testArray).mkString(" "))

}
