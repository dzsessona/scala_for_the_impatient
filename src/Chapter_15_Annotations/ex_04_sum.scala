package Chapter_15_Annotations.ex4

object Main extends App{

  def factorial(f:Int):Int = f match {
    case x if(x > 1) => (f to 1 by(-1)).reduceLeft(_ * _)
    case _ =>  (f to 1 by(-1)).foldLeft(1)(_ * _)
  }
  println("factorial of 1: " + factorial(1) )
  println("factorial of 0: " + factorial(0) )
  println("factorial of 2: " + factorial(2) )
  println("factorial of 5: " + factorial(5) )
  println("factorial of 10: " + factorial(10) )
}