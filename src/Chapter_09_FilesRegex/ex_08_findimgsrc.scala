package Chapter_09_FilesRegex.ex8

import scala.io.Source

object Main extends App {
  val source = Source.fromURL("http://www.gilt.com", "UTF-8")
  val page = source.mkString
  val srcPattern = """<img.*? src="(.+?)".*?>""".r

  srcPattern.findAllIn(page).matchData foreach {
    m => println("found img src:" + m.group(1))
  }
}
