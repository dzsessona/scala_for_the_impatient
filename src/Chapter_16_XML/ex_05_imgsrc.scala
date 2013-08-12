package Chapter_16_XML.ex5

import java.net.URL
import scala.xml.XML

object Main extends App{

  def getImgNames(url:URL)={
    val html = XML.load(url)
    val images = (html \\ "img")
    images.map(_.attribute("src").getOrElse("").toString).toList
  }

  println(getImgNames(new URL("http://en.wikipedia.org/wiki/XHTML")).mkString("\n"))
}

