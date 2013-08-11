package Chapter_04_Maps_Tuples.ex5

import scala.collection.immutable.TreeMap

object Main extends App{

  val file = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_04_Maps_Tuples/file_ex2in.txt"
  val in = new java.util.Scanner(new java.io.File(file))
  var wordss = new TreeMap[String, Int]
  while (in.hasNext) {
    val next = in.next
    wordss = wordss + (next -> (wordss.getOrElse(next, 0) + 1))
  }
  for ((word, count) <- wordss) println(word + " : " + count)
}
