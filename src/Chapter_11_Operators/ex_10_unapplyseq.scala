package Chapter_11_Operators.ex10

import java.io.File
import scala.io.Source

// Using RichFile implementation from Chapter 21
class RichFile(val from: File) {
  def read = Source.fromFile(from.getPath).mkString
}

object RichFile {
  def unapplySeq(input: RichFile): Option[Seq[String]] = {
    Some(input.from.getPath.split("""/""").drop(1))
  }
}

object Main extends App {
  val RichFile(path, name, extension) = new RichFile(new File("/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex1in.txt"))

  println("path: " + path)
  println("name: " + name)
  println("exts: " + extension)
}
