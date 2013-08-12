package Chapter_15_Annotations.ex5

import scala.io.Source
import java.io.IOException

object Main extends App{

  @throws(classOf[IOException])
  def readlines() = {
    val input: String = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex1in.txt"
    val source = Source.fromFile(input).getLines.toArray[String].foreach(println(_))
  }

  readlines()

}

