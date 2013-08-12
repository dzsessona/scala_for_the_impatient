package Chapter_09_FilesRegex.ex2

import scala.io.Source
import java.io.PrintWriter

object Main extends App{
  val column = 20
  var count: Int = 0
  val input = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex2in.txt"
  val output = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex2out.txt"
  val source = Source.fromFile(input)
  val out = new PrintWriter(output)

  for (c <- source) c match {
    case '\t' => {out.print(" " * (column - count % column)); count = 0;println("tab found and replaced")}
    case '\n' => {out.print(c);count = 0}
    case _ => {out.print(c);count += 1}
  }
  source.close()
  out.close()
}