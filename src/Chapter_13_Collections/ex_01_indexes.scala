package Chapter_13_Collections.ex1

import java.text.SimpleDateFormat
import scala.collection.{SortedSet, mutable}
import scala.collection.mutable.Map

object Main extends App{

  def mapIndexes(astring:String): Map[Char, SortedSet[Int]] = {
    val allindexes : Map[Char, SortedSet[Int]] = new mutable.HashMap[Char, SortedSet[Int]]()
    for (i <- 0 until astring.size) {
      if(allindexes.contains(astring(i))){
        allindexes(astring(i)) += i
      }else{
        allindexes(astring(i)) = SortedSet(i)
      }
    }
    allindexes
  }

  println(mapIndexes("Missisippi"))
  println(mapIndexes("diego"))


}
