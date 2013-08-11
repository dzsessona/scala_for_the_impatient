package Chapter_05_Classes.ex6

class Person(var age:Int) {
  if(age <0) age =0
}

object Main extends App{
  val posAge = new Person(33)
  println("age of person calling 33 -> " + posAge.age)
  val negAge = new Person(-33)
  println("age of person calling -33 -> " + negAge.age)
}
