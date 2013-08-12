package Chapter_07_Packages.ex7

object Main extends App {
  import java.util.{ HashMap => BlaBlaJavaHashMap }
  var javaHm = new BlaBlaJavaHashMap[java.lang.String, java.lang.String]

  javaHm.put("PostgreSQL", "Free Open Source Enterprise Database");
  javaHm.put("DB2", "Enterprise Database , It's expensive");
  javaHm.put("Oracle", "Enterprise Database , It's expensive");
  javaHm.put("MySQL", "Free Open SourceDatabase");

  import scala.collection.mutable.{ HashMap => ScalaHashMap }
  val scalaHm = new ScalaHashMap[String, String]
  import scala.collection.JavaConversions._
  scalaHm.putAll(javaHm)
  println(scalaHm)
}


