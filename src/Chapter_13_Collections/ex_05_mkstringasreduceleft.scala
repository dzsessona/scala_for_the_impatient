package Chapter_13_Collections.ex5

object Main extends App{
  def makeStringAsReduceleft[T](sequence:Seq[T]):String = {
    sequence.map(_.toString).reduceLeft(_ + _)
  }

  println(makeStringAsReduceleft(List("diego", "zambelli", "sessona")))
}

