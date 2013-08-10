package Chapter_02_Funcions.ex5

object Main extends App{

  def countdown(n:Int):Unit = {for(x <- n to 0 by -1) print(x + "\n")}
  countdown(4)
}
