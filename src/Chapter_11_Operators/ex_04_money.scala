package Chapter_11_Operators.ex4

class Money(val dollars:Int, val cents:Int){
  private def toCents = dollars * 100 + cents
  private def fromCents(cents: Int) = Money(cents / 100, cents % 100)
  override def toString = "$" + dollars + "." + cents

  def +(rhs: Money):Money = {
    val newCents = toCents + rhs.toCents
    fromCents(newCents)
  }

  def -(rhs: Money):Money = {
    val newCents = toCents - rhs.toCents
    fromCents(math.round(newCents).toInt)
  }

  def *(rhs: Double):Money = {
    val newCents = toCents * rhs
    fromCents(math.floor(newCents).toInt)
  }

  def /(rhs: Double):Money = {
    val newCents = toCents / rhs
    fromCents(math.floor(newCents).toInt)
  }

  def ==(rhs: Money):Boolean = {
    ((dollars == rhs.dollars) && (cents == rhs.cents))
  }

  def <(rhs: Money):Boolean= {
    (dollars < rhs.dollars || (dollars == rhs.dollars && cents < rhs.cents))
  }
}

object Money{
  def apply(dollars:Int, cents:Int) = new Money(dollars, cents)
}


object Main extends App{
  val money1 = Money(2, 25)
  val money2 = Money(1, 50)
  println(money1)
  println(money2)
  println(money1 + money2)
  println(money1 - money2)
  println(money1 * 2.0)
  println(money1 / 2.0)
  println(Money(1, 75) + Money(0, 50) == Money(2, 25))
}