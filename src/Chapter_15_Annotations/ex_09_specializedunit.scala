package Chapter_15_Annotations.ex9

object Main extends App{

  println("javap scala.collection.immutable.Range | grep Function1\n    public boolean validateRangeBoundaries(scala.Function1);\n    public final void foreach(scala.Function1);\n    public final scala.collection.immutable.Range takeWhile(scala.Function1);\n    public final scala.collection.immutable.Range dropWhile(scala.Function1);\n    public final scala.Tuple2 span(scala.Function1);\n    public final void foreach$mVc$sp(scala.Function1);\n    public scala.collection.GenMap groupBy(scala.Function1);\n    public final java.lang.Object dropWhile(scala.Function1);\n    public final java.lang.Object takeWhile(scala.Function1);")
  println("\nin fact it pass it as a function: \nfinal def foreach(f: (A) ⇒ Unit): Unit")
}