package Chapter_09_FilesRegex.ex3

import scala.io.Source

object Main extends App{
  val thefile = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex2in.txt"
  println(Source.fromFile(thefile).mkString.split("\\s+").count(_.length > 12))
}
