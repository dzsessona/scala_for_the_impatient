package Chapter_15_Annotations.ex7

import scala.annotation.tailrec

object tailrecutil{
  @tailrec
  def validsum(xs:Seq[Int], partial:BigInt):BigInt ={
    if(xs.isEmpty) partial else validsum(xs.tail,partial + xs.head)
  }
}

class tailrecutil{
  @tailrec
  final def validsum(xs:Seq[Int], partial:BigInt):BigInt ={
    if(xs.isEmpty) partial else validsum(xs.tail,partial + xs.head)
  }
}

object Main extends App{
  println("This code will not compile if I remove the final modifier from the class.")
}





