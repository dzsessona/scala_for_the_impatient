package Chapter_13_Collections.ex3

import scala.collection.mutable

object Main extends App{

  def removeInt(i: Int, list: mutable.LinkedList[Int]): mutable.LinkedList[Int] = {
    list.filter(_ != i)
  }

  println("original        : " + mutable.LinkedList(0,12,15,0,55).mkString(" "))
  println("fisrt removed 0 : " + removeInt(0, mutable.LinkedList(0,12,15,0,55)))
  println("fisrt removed 55: " + removeInt(55, mutable.LinkedList(0,12,15,0,55)))
}
