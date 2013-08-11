package Chapter_04_Maps_Tuples.ex8

object Main extends App{

  def minmax(values: Array[Int]) : (Int,Int) = (values.min,values.max)

  println("array: " + Array(1231,894561,6881,61684,65,4646,654,6).mkString(" "))
  println("minmax: " +  minmax(Array(1231,894561,6881,61684,65,4646,654,6)))

}
