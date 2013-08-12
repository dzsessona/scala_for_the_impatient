package Chapter_16_XML.ex8

object Main extends App{

  def dl2map(seq: scala.xml.NodeSeq) ={
    val zippedlist = ((seq \\ "dt") text).toList.zip((seq \\ "dd") text)
    zippedlist.toMap
  }

  println(dl2map(<dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>))
}
