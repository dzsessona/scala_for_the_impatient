package Chapter_13_Collections.ex2

object Main extends App{
  def indexes(astring: String): Map[Char, List[Int]] = {
    val result = astring.zipWithIndex.groupBy(_._1)
    result.map(x => (x._1, (x._2.map(_._2)).toList) )
  }

  println(indexes("Missisippi"))
  println(indexes("diego"))
}