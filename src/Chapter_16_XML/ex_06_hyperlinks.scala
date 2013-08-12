package Chapter_16_XML.ex6

import java.net.URL
import scala.xml.XML

object Main extends App{

  def getHiperlinks(url:URL): List[(String,String)]={
    val html = XML.load(url)
    val images = (html \\ "a").toList
    for(a <- images) yield (a.attribute("href").getOrElse("").toString, a.child.mkString)
  }

  val links = getHiperlinks(new URL("http://en.wikipedia.org/wiki/XHTML"))
  for(a <- links) println("link: " + a._1 +"\ttext: " + a._2)
}