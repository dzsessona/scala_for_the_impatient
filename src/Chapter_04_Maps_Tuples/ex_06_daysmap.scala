package Chapter_04_Maps_Tuples.ex6

import java.util.Calendar._

object Main extends App{

  val days = scala.collection.mutable.LinkedHashMap(
    "MONDAY" -> MONDAY,
    "TUESDAY" -> TUESDAY,
    "WEDNESDAY" -> WEDNESDAY,
    "THURSDAY" -> THURSDAY,
    "FRIDAY" -> FRIDAY,
    "SATURDAY" -> SATURDAY,
    "SUNDAY" -> SUNDAY
  )
  for ( (k, v) <- days ) printf("%s=%d\n", k, v)
}
