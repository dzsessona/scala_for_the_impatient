package Chapter_03_Arrays.ex3

import Chapter_03_Arrays.ex1.Main.populateRandArray

object Main extends App{

  def swapAdj(a: Array[Int]): Array[Int] = {
    val tmp = for(i <- 0 until a.size) yield
      if (i % 2 == 0){
        if (i < a.size-1) a(i+1) else a(i)
      }else a(i-1)
    tmp.toArray
  }

  val testArray = populateRandArray(7)
  println("array (passing 7): " +testArray.mkString(" "))
  println("after swapping   : " +swapAdj(testArray).mkString(" "))

}
