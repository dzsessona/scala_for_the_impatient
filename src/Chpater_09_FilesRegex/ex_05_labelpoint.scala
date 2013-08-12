package Chapter_09_FilesRegex.ex5

class Point(val x:Int,val y:Int){
  override def toString = "Point(%d, %d)".format(x, y)
}

class LabelPoint(val label:String, x:Int, y:Int) extends Point(x,y){
  override def toString = { "Label"+super.toString+" label: "+label }
}

object Main extends App{
  val point = new LabelPoint("diego", 123,12)
  println("LabelPoint(\"diego\", 123,12): " + point)
}

