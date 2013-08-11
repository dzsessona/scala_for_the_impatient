package Chapter_06_Objects.ex5

object Main extends App{
  val reversed = for(i <- args.reverse) yield i
  print(reversed.mkString(" "))
}
