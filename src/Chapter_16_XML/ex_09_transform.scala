package Chapter_16_XML.ex9

import java.net.URL
import scala.xml.transform.{RuleTransformer, RewriteRule}
import scala.xml.{Null, Attribute, Elem, XML, Node}

object Main extends App{

  val html = XML.load(new URL("http://en.wikipedia.org/wiki/XHTML"))

  val addTag = new RewriteRule {
    override def transform(n: Node) = n match{
      //missing a guard to add it only to the ones that don't have an alt,
      //this doc has all alt so modifying all of them instead
      case e @ <img/> => e.asInstanceOf[Elem] % Attribute(null,"alt", "TODO", Null)
      case _ => n
    }
  }

  val tranformed = new RuleTransformer(addTag).transform(html)
  println(tranformed)
}