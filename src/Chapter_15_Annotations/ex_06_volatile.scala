package Chapter_15_Annotations.ex6

object Main extends App{
  //just apply the fun as map and get the max
  def largest(fun: (Int) => Int, inputs: Seq[Int]) = {
    val index = inputs.zip(inputs.map(fun(_)))
    index.maxBy(_._2)._1
  }

  print("max value: " + largest(x => 10 * x - x * x, 1 to 10))
}