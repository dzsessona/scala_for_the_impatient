package Chapter_16_XML.ex7

object Main extends App{

  def map2dl(m: Map[String,String]):scala.xml.NodeSeq ={
    var s = <dl/>
    for((k,v) <- m){ s = s.copy(child = s.child ++ <dt>{k}</dt><dd>{v}</dd>)};s
  }

  println(map2dl(Map("A" -> "1", "B" -> "2")))
}



