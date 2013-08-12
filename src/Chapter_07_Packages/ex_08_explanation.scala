package Chapter_07_Packages.ex8

object Main extends App{
  println("These two statements import the entire packages java and javax, which, collectively, " +
    "contain most of the classes/packages in the entire JRE. \n" +
    "This is not a good idea, as it has the potential to introduce naming conflicts in client code.")
}
