package Chapter_03_Arrays.ex4

object Main extends App{

  def reorderArray(original: Array[Int]): Array[Int] ={
    val parted = original.toList.partition(_ > 0)
    List(parted._1,parted._2).flatten.toArray
  }
  val original=Array(1,-2,0,3,-4,5,-6)

  println("original : " +original.mkString(" "))
  println("reordered: " +reorderArray(original).mkString(" "))
}
