package Chapter_16_XML.ex2

object Main extends App{

  val xml = """<ul><li>Opening bracket: [</li><li>Closing bracket: ]</li><li>Opening brace: {</li><li>Closing brace: }</li></ul>"""
  println("The result of " + xml +" is an error, because {} are considered as scala")
  println("To fix it i have to escape the braces, doubling them:")
  val escaped = <ul>
    <li>Opening bracket: [</li>
    <li>Closing bracket: ]</li>
    <li>Opening brace: {{</li>
    <li>Closing brace: }}</li>
  </ul>
  println("result:" + escaped)
}