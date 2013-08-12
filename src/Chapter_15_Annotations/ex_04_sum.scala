package Chapter_15_Annotations.ex4

import scala.annotation.varargs

object Main extends App{

  @varargs
  def sumit (nums: Int*):Int ={
    nums.sum
  }
}