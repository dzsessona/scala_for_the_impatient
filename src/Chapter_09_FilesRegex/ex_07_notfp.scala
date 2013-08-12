package Chapter_09_FilesRegex.ex7

import scala.io.Source

object Main extends App {
  val notfp = Source.fromFile("/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex7in.txt").mkString.split("""\s+""").filter(
    "^[0-9]+(\\.[0-9]+)?$".r findFirstIn _ match {
      case Some(_) => false
      case None => true
    })
  for(nfp <- notfp)println("not floating piont:" + nfp)
}


