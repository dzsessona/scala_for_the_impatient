package Chapter_16_XML.ex10

// yes need call by name so it evaluates only at call
// currying gives you nice syntax
object Main extends App{

  def unless(condition: Boolean)(block: => Unit) = {
    if(!condition) block
  }

  unless(true)(print("executing block (passing true)"))
  unless(false)(print("executing block (passing false)"))

}
