package Chapter_04_Maps_Tuples.ex9

object Main extends App{

  def leegr(values: Array[Int]) : (Int,Int,Int) ={
    var (lt, eq, gt) = (0, 0, 0)
    for(n <- values) n match {
      case x if(x>0) => gt += 1
      case x if(x<0) => lt += 1
      case _ => eq += 1
    }
    (lt, eq, gt)
  }

  val array = Array(-1,-1,0,0,54,455,45)

  println("array: " + array.mkString(" "))
  println("leggr: " + leegr(array))

}
