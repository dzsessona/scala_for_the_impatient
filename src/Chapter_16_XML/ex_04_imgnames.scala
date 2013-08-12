package Chapter_16_XML.ex4

import java.net.URL
import scala.xml.XML

object Main extends App{


  val html = XML.load(new URL("http://en.wikipedia.org/wiki/XHTML"))
  val images = (html \\ "img").filter(_.attribute("alt").isDefined)
  val images2 = images.filter(_.attribute("alt").getOrElse("").toString.isEmpty)


  println("""All images for this page are defined ((html \\\\ \"img\").filter(_.attribute(\"alt\").isDefined):""" )
  println(images.mkString("\n"));

  println("\nBut there are a few empty ones:")
  println(images2.mkString("\n"));
}