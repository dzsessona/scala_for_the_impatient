package Chapter_09_FilesRegex.ex4

import scala.io.Source

object Main extends App{
  val thefile = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex4in.txt"
  val numbers = Source.fromFile(thefile).mkString.split("""\s+""").map(_.toDouble)

  println("Numbers: " + numbers.mkString(", "))
  println("Sum: " + numbers.sum)
  println("Avg: " + numbers.sum / numbers.length)
  println("Min: " + numbers.min)
  println("Max: " + numbers.max)
}