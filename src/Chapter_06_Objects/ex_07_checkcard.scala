package Chapter_06_Objects.ex7

class Person(name: String) {
  val firstName = name.split("\\s+")(0)
  val lastName = name.split("\\s+")(1)

  override def toString = "Person(" + firstName + ", " + lastName + ")"
}

object Main extends App{
  val diego=new Person("Diego Zambellli")
  println(diego)
  println("\nshould be plain parameter because so name is a\n// object private field, in fact the compiled class is:\n//\n//public class Person extends java.lang.Object implements scala.ScalaObject{\n//  private final java.lang.String firstName;\n//  private final java.lang.String lastName;\n//  public java.lang.String firstName();\n//  public java.lang.String lastName();\n//  public java.lang.String toString();\n//  public Person(java.lang.String);\n//}")

}


