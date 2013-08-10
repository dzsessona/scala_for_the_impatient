package Chapter_03_Arrays.ex1

object Main extends App{

  def populateRandArray(n:Int): Array[Int] ={
    val list = for(i <- 0  until n) yield util.Random.nextInt(n)
    list.toArray
  }
  val testArray = populateRandArray(7)

  println("array (passing 7): " +testArray.mkString(" "))
}
