package Chapter_04_Maps_Tuples.ex1

object Main extends App{

  val things = Map("computer" -> 100, "moto" -> 2000, "tv" -> 800)
  val thingsDiscounted=for((k,v)<-things) yield (k, v * 0.9)

  println("things  : " +things.mkString(" "))
  println("discount: " +thingsDiscounted.mkString(" "))
}
