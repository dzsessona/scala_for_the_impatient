package Chapter_13_Collections.ex8

object Main extends App{

  def array2dimensional(array: Array[Double], cols:Int):IndexedSeq[Any] ={
    Array(array.grouped(cols).toArray).deep
  }

  val testArray = Array(1.0,15.5,12.6,35.2,48.2,23.2)
  println(array2dimensional(testArray,3).mkString(" "))

}
