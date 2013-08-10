package Chapter_03_Arrays.ex7

object Main extends App{

  println("original         : " + Array(1,1,1,2,2,2).mkString(" "))
  println("original.distinct: " + Array(1,1,1,2,2,2).distinct.mkString(" "))
}
