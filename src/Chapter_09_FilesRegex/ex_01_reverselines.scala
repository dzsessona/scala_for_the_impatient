package Chapter_09_FilesRegex.ex1

import scala.io.Source
import java.io.PrintWriter

object Main extends App{
  val input = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex1in.txt"
  val output = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex1out.txt"
  val out = new PrintWriter(output)
  val source = Source.fromFile(input).getLines.toArray[String].reverse.foreach(out.println(_))
  out.close()
}
