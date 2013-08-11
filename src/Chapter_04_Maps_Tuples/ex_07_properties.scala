package Chapter_04_Maps_Tuples.ex7

object Main extends App{

  import scala.collection.JavaConversions.propertiesAsScalaMap
  val props: scala.collection.Map[String, String] = System.getProperties()
  val maxLength = props.keySet.maxBy(_.size).size
  for((k,v) <- props) {
    val diff = maxLength - k.size
    printf("%s%s| %s\n", k, " " * diff, v)
  }
}
