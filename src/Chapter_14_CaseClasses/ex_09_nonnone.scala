package Chapter_14_CaseClasses.ex9

object Main extends App{

  def computeNonValueSum(list:List[Option[Int]]):Int ={
    list.map(_.getOrElse(0)).sum
  }

  val x = List(Some(10), None, Some(20), None, Some(30))
  println("list: " + x.mkString(" "))
  println("computeNonValueSum(x): " + computeNonValueSum(x))

}