package Chapter_06_Objects.ex7

object Suits extends Enumeration {
  type Suits = Value
  val Club = Value("♣")
  val Diamond = Value("♦")
  val Heart = Value("♥")
  val Spade = Value("♠")

  def isRed(suit: Suits): Boolean = suit == Suits.Diamond || suit == Suits.Heart
}

object Main extends App{
  for (t <- Suits.values) println(t + " is red: "+ Suits.isRed(t))
}


