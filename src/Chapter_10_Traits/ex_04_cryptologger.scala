package Chapter_10_Traits.ex4

trait Logger {
  def log(msg: String)
}

class CryptoLogger extends {
  private val alphaU = 'A' to 'Z'
  private val alphaL = 'a' to 'z'

  def log(msg: String) {
    println(encode(msg, -3))
  }

  def encode(text:String, key:Int) = text.map{
    case c if alphaU.contains(c) => rot(alphaU, c, key)
    case c if alphaL.contains(c) => rot(alphaL, c, key)
    case c => c
  }

  private def rot(a:IndexedSeq[Char], c:Char, key:Int) =
    a((c - a.head + key + a.size) % a.size)
}

object Main extends App{

  val cipher = new CryptoLogger
  println("the text 'This is a logging test' should get encrypted in the logs:")
  cipher.log("This is a logging test")
}