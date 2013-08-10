package Chapter_02_Funcions.ex9

object Main extends App{

  def prodRec(str:String):Long = {
    if (str.length == 0) 1L
    else str.head.toLong * prodRec(str.tail)
  }

  println("Product of all letters: " + prodRec("Hello"))

}
