package Chapter_11_Operators.ex5

class Table(var _cell: String) {
  def |(cell: String):Table = { _cell += ("<td>" + cell + "</td>");this }

  def ||(cell: String = ""):Table = cell match{
    case c if(c.isEmpty) => { _cell += "</tr></table>"; this }
    case _ => { _cell += ("</tr><tr><td>" + cell + "</td>");this }
  }

  override def toString():String = _cell
}


object Table{
  def apply(cell: String = "<table><tr>") = new Table(cell)
}


object Main extends App{
  val contructedTable: Table = Table() | "java" | "scala" || "Goslin" | "Odersky" || "jvm" | "jvm, .net" || ""
  println("original : Table() | \"java\" | \"scala\" || \"Goslin\" | \"Odersky\" || \"jvm\" | \"jvm, .net\" || \"\"" )
  println("htmltable: " + contructedTable)
}

