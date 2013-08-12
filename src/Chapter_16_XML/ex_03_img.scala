package Chapter_16_XML.ex3

import scala.xml.Text

object Main extends App{
  println(<li>fred</li> match { case <li>{Text(t)}</li> => t })
  println("""<li>fred</li> match { case <li>{Text(t)}</li> => t }""")
  println("""<li>{"fred"}</li> match { case <li>{Text(t)}</li> => t }""")
  println("acts differently because the match evaluates before the substitution? No idea....")

  println("match uses the unapplySeq, and the two are identical:")
  println("""scala.xml.Elem.unapplySeq(<li>{"fred"}</li>).get ->""" + scala.xml.Elem.unapplySeq(<li>{"fred"}</li>).get)
  println("""scala.xml.Elem.unapplySeq(<li>fred</li>).get ->""" + scala.xml.Elem.unapplySeq(<li>fred</li>).get)

  println("""anyway this works: <li>{"fred"}</li> match { case <li>{f @ _*}</li> => f.text }""" )
}
