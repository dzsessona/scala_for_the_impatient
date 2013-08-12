package Chapter_13_Collections.ex4

object Main extends App{

def convToInt(vals: Array[String], valmap: Map[String, Int]) : Array[Int] = {
val s =vals.map(valmap.get(_))
s.flatMap(i => i)
}

val converted = convToInt(Array("tom", "fred", "harry"), Map("tom" ->3, "fred" -> 4, "harry" -> 5))
println(converted.mkString(" "))
}