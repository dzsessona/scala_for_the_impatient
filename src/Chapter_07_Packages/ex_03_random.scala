package Chapter_07_Packages.ex3

package object random {
  private[random] var prev = 0;

  def nextInt: Int = {
    val next = (prev * 1664525) + (1013904223 % math.pow(2, 32).toInt)
    prev = next
    next
  }

  def nextDouble: Double = {
    nextInt.toDouble
  }

  def setSeed(seed: Int) {
    prev = seed
  }
}

object Main extends App {
  random.setSeed(0)
  val randomInt = random.nextInt
  println(randomInt)
  val randomDouble = random.nextDouble
  println(randomDouble)
  val randomInt2 = random.nextInt
  println(randomInt2)
  val randomDouble2 = random.nextDouble
  println(randomDouble2)
}
