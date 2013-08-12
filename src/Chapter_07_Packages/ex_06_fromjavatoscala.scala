package Chapter_07_Packages.ex6

import scala.collection.JavaConversions._
import java.util.{ HashMap => JavaHashMap }
import scala.collection.mutable.{ HashMap => ScalaHashMap }

object Main extends App {
  var javaHm = new JavaHashMap[java.lang.String, java.lang.String]

  javaHm.put("PostgreSQL", "Free Open Source Enterprise Database");
  javaHm.put("DB2", "Enterprise Database , It's expensive");
  javaHm.put("Oracle", "Enterprise Database , It's expensive");
  javaHm.put("MySQL", "Free Open SourceDatabase");

  val scalaHm = new ScalaHashMap[String, String]
  scalaHm.putAll(javaHm)
  println(scalaHm)
}
