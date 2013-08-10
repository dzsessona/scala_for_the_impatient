package Chapter_03_Arrays.ex8

import collection.mutable.ArrayBuffer

object Main extends App{

  var a = ArrayBuffer(2, -10, 3, -5, 5, -15, 7, 11)
  var negIndices = for (i <- 0 until a.length if a(i) < 0) yield i
  val indices = negIndices.reverse.dropRight(1)
  for (elem <- indices) a.remove(elem)

  println(a.mkString(" "))
}
