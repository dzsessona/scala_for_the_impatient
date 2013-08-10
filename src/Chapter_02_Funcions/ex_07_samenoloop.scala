package Chapter_02_Funcions.ex7

object Main extends App{

  def allLetter(s:String): Long = {
    s.foldLeft(1L)(_ + _.toLong)
  }

  println("Sum of all letters: " + allLetter("Hello"))
}
