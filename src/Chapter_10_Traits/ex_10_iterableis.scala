package Chapter_10_Traits.ex10

import java.io.FileInputStream
import java.io.InputStream
import java.io.File
import java.io.FileDescriptor
import collection.Iterable

class IterableInputStream(val is: InputStream)
  extends InputStream with Iterable[Int] {
  def iterator: Iterator[Int] = new Iterator[Int] {
    private var i = 1
    def hasNext: Boolean =  {
      is.available > 0
    }
    def next() : Int = {
      val n = is.read
      i += 1
      n
    }
  }

  def read = {
    is.read
  }
}

object Main extends App {
  val iis = new IterableInputStream(new FileInputStream("/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex1in.txt"))

  for (b <- iis)
    println(b.toChar)

  iis.close
}
