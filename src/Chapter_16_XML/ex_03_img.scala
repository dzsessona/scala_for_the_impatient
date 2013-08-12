package Chapter_16_XML.ex3

object Main extends App{

  def factorial(f:Int):Int ={
    (f to 1 by(-1)).reduceLeft(_ * _)
  }
  println("factorial of 2: " + factorial(2) )
  println("factorial of 5: " + factorial(5) )
  println("factorial of 10: " + factorial(10) )
}
