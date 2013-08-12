package Chapter_11_Operators.ex6

class ASCIIArt(var _fig: String) {
  def |(fig: ASCIIArt) = {
    val figLinePairs = _fig.split("\n").zip(fig.toString.split("\n"))
    _fig = ""
    for ((origFigLine, figLine) <- figLinePairs) _fig += (origFigLine + figLine + "\n")
    _fig
  }

  def -(fig: ASCIIArt) = {
    _fig += "\n" + fig
    _fig
  }

  override def toString = _fig
}

object ASCIIArt {
  def scalaDog = {
    new ASCIIArt(""" /\_/\ """ + "\n" +
      """( ' ' )""" + "\n" +
      """(  -  )""" + "\n" +
      """ | | | """ + "\n" +
      """(__|__)""")
  }

  def scalaCoder = {
    new ASCIIArt("""   -----  """ + "\n" +
      """ / Hello \""" + "\n" +
      """< Scala  |""" + "\n" +
      """ \ Coder /""" + "\n" +
      """   -----  """)
  }
}

object Main extends App {
  println(ASCIIArt.scalaDog | ASCIIArt.scalaCoder)
  println(ASCIIArt.scalaDog - ASCIIArt.scalaCoder)
}