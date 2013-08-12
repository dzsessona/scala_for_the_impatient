package Chapter_13_Collections.ex6

object Main extends App{
  val lst = List(1,2,3,4,5,6,7,8,9)
  println("build the collection folding left and then appending to the new empty list")
  println((lst :\ List[Int]())(_ :: _))
  println("same thing but folding right")
  println((List[Int]() /: lst)(_ :+ _))

  println("reverse")
  println((List[Int]() /: lst)((a,b) => b ::a ))
}