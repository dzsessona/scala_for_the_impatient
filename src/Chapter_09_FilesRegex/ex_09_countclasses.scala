package Chapter_09_FilesRegex.ex9

import scala.sys.process._

object Main extends App{
  val mio :String = "find /Users/dzsessona -type f" !!

  val onlyClass = mio.split("\n").filter(_.endsWith("class"))
  println(onlyClass.mkString("\n"))
  println("found " + onlyClass.length + " classes")
}