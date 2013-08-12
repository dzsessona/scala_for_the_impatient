package Chapter_09_FilesRegex.ex6

import scala.io.Source

object Main extends App {
  val source = Source.fromFile("/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/hello.java")
  val lines = source.getLines()
  val pattern = """([^"\\]*([\\]+"[^"\\]*)*)""".r

  for (line <- lines) pattern findFirstIn line match {
    case Some(s: String) => println("comment: " + s)
    case None =>
  }
}
