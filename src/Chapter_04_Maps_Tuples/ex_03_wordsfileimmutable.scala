package Chapter_04_Maps_Tuples.ex3

object Main extends App{

  val file = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_04_Maps_Tuples/file_ex2in.txt"
  val in = new java.util.Scanner(new java.io.File(file))
  var words = new scala.collection.immutable.HashMap[String, Int]
  while (in.hasNext) {
    val next = in.next
    words = words + (next -> (words.getOrElse(next, 0) + 1))
  }
  for ((word, count) <- words) println(word + " : " + count)
}
