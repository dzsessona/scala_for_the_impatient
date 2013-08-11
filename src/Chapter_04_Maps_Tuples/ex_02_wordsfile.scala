package Chapter_04_Maps_Tuples.ex2

object Main extends App{

  val file = "/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_04_Maps_Tuples/file_ex2in.txt"
  val in = new java.util.Scanner(new java.io.File(file))
  val frequence = new scala.collection.mutable.HashMap[String, Int]
  while (in.hasNext) { val t = in.next
    t match {
      case s if(frequence.contains(s)) => frequence(s) += 1
      case _ => frequence(t) = 1
    }
  }
  for ((word, count) <- frequence) println(word + " : " + count)

}
