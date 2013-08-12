package Chapter_11_Operators.ex3

class Fraction(n:Int, d:Int){

  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)
  override def toString = num + "/" + den
  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

  def +(rhs: Fraction) : Fraction = {
    val newNum = num + rhs.num
    val newDen = den + rhs.den
    val newGcd = gcd(newNum, newDen)
    Fraction(newNum / newGcd, newDen / newGcd)
  }

  def -(rhs: Fraction) : Fraction = {
    val newNum = num - rhs.num
    val newDen = den - rhs.den
    val newGcd = gcd(newNum, newDen)
    Fraction(newNum / newGcd, newDen / newGcd)
  }

  def *(rhs: Fraction) : Fraction = {
    val newNum = num * rhs.num
    val newDen = den * rhs.den
    val newGcd = gcd(newNum, newDen)
    Fraction(newNum / newGcd, newDen / newGcd)
  }

  def /(rhs: Fraction) : Fraction = {
    val newNum = num / rhs.num
    val newDen = den / rhs.den
    val newGcd = gcd(newNum, newDen)
    Fraction(newNum / newGcd, newDen / newGcd)
  }
}

//companion to define apply
object Fraction{
  def apply(n:Int, d:Int) = new Fraction(n, d)
}

object Main extends App{
  val frac1 = Fraction(15, -6)
  println("Fraction(15, -6): " + frac1.toString)
  val frac2 = Fraction(2, 3)
  println("Fraction(2, 3)  : " +  frac2.toString)
  println("(frac1 * frac2) : "+ (frac1 * frac2))
}
