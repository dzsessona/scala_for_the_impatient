package Chapter_07_Packages.ex5

object Main extends App {
  println("'private[com] def giveRaise(rate:Double)' means a private function to the com namespace " +
    "that takes in a double argument called rate. " +
    "It is useless as it does not return any value (it returns Unit).")
}
