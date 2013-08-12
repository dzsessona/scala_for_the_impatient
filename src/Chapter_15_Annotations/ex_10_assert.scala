package Chapter_15_Annotations.ex10

import scala.annotation.elidable._
import scala.annotation.elidable

object Main extends App{

  @elidable(ASSERTION) def factorial(n:Int) :Int ={
    assert( n >= 0)
    if (n==0) 1 else n * factorial(n-1)
  }

  println("if i compile without assertion (calac -Xelide-below 2001 ex_10_assert.scala):\n")
  println("public final class Chapter_15_Annotations.ex10.Main$ extends java.lang.Object implements scala.App{\n    public static final Chapter_15_Annotations.ex10.Main$ MODULE$;\n    private final long executionStart;\n    private java.lang.String[] scala$App$$_args;\n    private final scala.collection.mutable.ListBuffer scala$App$$initCode;\n    public static {};\n    public long executionStart();\n    public final java.lang.String[] scala$App$$_args();\n    public final void scala$App$$_args_$eq(java.lang.String[]);\n    public final scala.collection.mutable.ListBuffer scala$App$$initCode();\n    public void scala$App$_setter_$executionStart_$eq(long);\n    public void scala$App$_setter_$scala$App$$initCode_$eq(scala.collection.mutable.ListBuffer);\n    public java.lang.String[] args();\n    public void delayedInit(scala.Function0);\n    public void main(java.lang.String[]);\n    private Chapter_15_Annotations.ex10.Main$();\n}")
  println("\nThis will throw an AssertionError")
  println(factorial(-1))
}
