package Chapter_14_CaseClasses.ex10

import math.sqrt

object Main extends App{

  type T = Double => Option[Double]

  //apply first function, if none return none
  //otherwise appy second function
  def compose(f:T, g:T): T ={
    (x:Double) => f(x) match {
      case Some(x) => g(x)
      case None => None
    }
  }

  def f(x: Double) = if (x >= 0) Some(sqrt(x)) else None
  def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
  val h = compose(f, g)

  println(h) //so h now is a function
  println(h(2))
  println(h(0))




}
