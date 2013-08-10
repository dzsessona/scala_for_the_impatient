package Chapter_03_Arrays.ex6

object Main extends App{

  import scala.collection.mutable.ArrayBuffer

  val s = Array(1, 3, 5, 2, 4).sortWith(_ > _)
  val t= ArrayBuffer(1, 3, 5, 2, 4).sortWith(_ > _)

  println("t    : " + Array(1, 3, 5, 2, 4).mkString(" "))
  println("t rev: " + t.mkString(" "))
}
