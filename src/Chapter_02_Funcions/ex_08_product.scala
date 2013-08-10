package Chapter_02_Funcions.ex8

object Main extends App{

  def allLetter(s:String): Long = {
    s.foldLeft(1L)(_ * _.toLong)
  }

  println("Product of all letters: " + allLetter("Hello"))
}
