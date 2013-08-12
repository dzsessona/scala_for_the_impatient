package Chapter_15_Annotations.ex5

object Main extends App{
  //just apply the fun as map and get the max
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    inputs.map(fun).max
  }

  println(largest(x => 10 * x - x * x, 1 to 10))
}

