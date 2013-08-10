package Chapter_02_Funcions.ex6

object Main extends App{

  def allLetter(s:String): Long = {
    var prod = 1L
    for(c <- s) prod += c.toLong
    prod
  }

  println("Sum of all letters: " + allLetter("Hello"))
}
