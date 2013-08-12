package Chapter_09_FilesRegex.ex5

import java.io.PrintWriter

object Main extends App {
  val out = new PrintWriter("/Users/dzsessona/Projects/scala_for_the_impatient/src/Chapter_09_FilesRegex/file_ex5out.txt")
  for (i <- 0 to 20) {
    val power = math.pow(2, i)
    out.print("%10.0f\t%10.5g\n".format(power, 1.0 / power))
  }
  out.close
}

