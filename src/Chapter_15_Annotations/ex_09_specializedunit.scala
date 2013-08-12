package Chapter_15_Annotations.ex9

object Main extends App {
  def corresponds(lhs: Seq[String], rhs: Seq[Int], p: (String, Int) => Boolean): Boolean = {
    (lhs zip rhs).map(t => p(t._1, t._2)).max
  }

  val c = Array("Ciao!", "Gilt!")
  val d = Array("Ciao!".size, "Gilt!".size)
  val e = Array(2, 19)

  println("c: "+c.mkString(" ") )
  println("d: "+d.mkString(" ") )
  println("e: "+e.mkString(" ") )
  println("corresponds(c, d, _.size == _): " + corresponds(c, d, _.size == _))
  println("corresponds(c, e, _.size == _): " + corresponds(c, e, _.size == _))
}