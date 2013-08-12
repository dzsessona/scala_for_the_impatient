package Chapter_13_Collections.ex7

import Function.tupled

object Main extends App {
  val prices = List(5.0, 20.0, 9.95)
  val quantities = List(10, 2, 1)

  println((prices zip quantities) map { p => p._1 * p._2 })
  println((prices zip quantities) map tupled { _ * _ })
}



