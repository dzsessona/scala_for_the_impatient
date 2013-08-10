package Chapter_03_Arrays.ex9

object Main extends App{

  val allTZ = java.util.TimeZone.getAvailableIDs.filter(_.startsWith("America")).map(_.stripPrefix("America/")).sorted
  println("Timezones:\n " + allTZ.mkString("\n"))

}
