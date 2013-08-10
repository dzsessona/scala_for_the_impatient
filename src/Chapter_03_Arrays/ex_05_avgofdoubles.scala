package Chapter_03_Arrays.ex5

object Main extends App{

  def doubleAvg(orig:Array[Double]): Double= orig.sum/orig.length

  println("avg of 2.0, 4.0: " + doubleAvg(Array(2.0,4.0)))
}
