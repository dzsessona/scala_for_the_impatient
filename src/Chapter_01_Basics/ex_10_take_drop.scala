package Chapter_01_Basics.ex10

object Main extends App{
  val test = "teststring"
  println("\"teststring\".head: " +(test.head))
  println("\"teststring\".last: " +(test.last))
  println("\"teststring\".take(2): " +(test.take(2)))
  println("\"teststring\".takeRight(2): " +(test.takeRight(2)))
  println("\"teststring\".drop(2): " +(test.drop(2)))
  println("\"teststring\".dropRight(2): " +(test.dropRight(2)))
}
