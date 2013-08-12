package Chapter_10_Traits.ex9

import Chapter_10_Traits.ex7.Bufferable
import java.io.{FileInputStream, File}

object Main extends App {
  val bfis = new FileInputStream(new File("/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex1in.txt"))
    with Bufferable

  var c : Int = 0
  while ({ c = bfis.read; c != -1}) {
    print(c.toChar)
  }

  bfis.close
}