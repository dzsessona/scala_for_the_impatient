package Chapter_06_Objects.ex5

import scala.reflect.BeanProperty

class Student(@BeanProperty var id: Int = 0, @BeanProperty var name: String = "")

object Main extends App{

  println("output of javap -p Student:\n")
  println("public class Chapter_05_Classes.ex5.Student extends java.lang.Object{\n    private int id;\n    private java.lang.String name;\n    public static java.lang.String $lessinit$greater$default$2();\n    public static int $lessinit$greater$default$1();\n    public int id();\n    public void id_$eq(int);\n    public void setId(int);\n    public java.lang.String name();\n    public void name_$eq(java.lang.String);\n    public void setName(java.lang.String);\n    public int getId();\n    public java.lang.String getName();\n    public Chapter_05_Classes.ex5.Student(int, java.lang.String);\n}")
}
