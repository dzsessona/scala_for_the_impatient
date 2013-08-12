package Chapter_12_HigerOrderFunction.ex1

object Main extends App{
  //example: values(x => x * x, -5, 5) should produce a collection of pairs (-5, 25), (-4, 16)
  def values(fun: (Int) => Int, low: Int, high: Int){
    val res = (low to high).map(fun)
    val zipped = (low to high) zip res
    for(a <- zipped )println(a)
  }
  //test like example
  println("values(x => x * x, -5, 5)")
  values(x => x * x, -5, 5)

}
