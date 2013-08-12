package Chapter_16_XML.ex1

object Main extends App{
  println("<fred/>(0) returns the first node of the Node seq: " + <fred/>(0) )
  println("<fred/>(0)(0) returns the first node of of the first node of Node seq: " + <fred/>(0)(0) )
  println("<diego/><zambelli/><sessona/>(1) should explain: " + <diego/><zambelli/><sessona/>(1))
}
