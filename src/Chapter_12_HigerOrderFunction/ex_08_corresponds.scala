package Chapter_12_HigerOrderFunction.ex8

import scala.collection.JavaConversions._

object Main extends App {
  val c = Array("Ciao!", "Gilt!")
  val d = Array("Ciao!".size, "Gilt!".size)
  val e = Array(2, 19)

  println("c: "+c.mkString(" ") )
  println("d: "+d.mkString(" ") )
  println("e: "+e.mkString(" ") )
  println("c.corresponds(d)(_.size == _): " + c.corresponds(d)(_.size == _))
  println("c.corresponds(e)(_.size == _): " + c.corresponds(e)(_.size == _))
}
