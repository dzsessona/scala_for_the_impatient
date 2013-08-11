package Chapter_05_Classes.ex1

class Counter(private var value: Int = 0) {
  def increment() { if (value < Int.MaxValue) value += 1 }
  def current = value
}

object Main extends App{
  val counter = new Counter(Int.MaxValue - 1)
  println("counter: " + counter.current)
  counter.increment()
  println("counter: " + counter.current)
  counter.increment()
  println("counter: " + counter.current)
}
