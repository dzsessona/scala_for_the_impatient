package Chapter_09_FilesRegex.ex10

import collection.mutable.ArrayBuffer
import java.io._

@SerialVersionUID(42L) class Person(val name: String)
  extends Serializable {
  val friends: ArrayBuffer[Person] = new ArrayBuffer

  override def toString() = name
}

object Main extends App {

  val diego = new Person("Diego")
  val colm = new Person("Colm")
  val graham = new Person("Graham")
  val jenny = new Person("Jenny")

  diego.friends += colm
  colm.friends += (diego, jenny)
  graham.friends += (colm, diego)
  jenny.friends += (diego, colm, graham)

  val out = new ObjectOutputStream(new FileOutputStream("/tmp/test.obj"))
  out.writeObject(diego)
  out.writeObject(colm)
  out.writeObject(graham)
  out.writeObject(jenny)
  out.close

  println(diego.friends.mkString(", "))
  println(colm.friends.mkString(", "))
  println(graham.friends.mkString(", "))
  println(jenny.friends.mkString(", "))

  val in = new ObjectInputStream(new FileInputStream("/tmp/test.obj"))
  val savedDiego = in.readObject().asInstanceOf[Person]
  val savedColm = in.readObject().asInstanceOf[Person]
  val savedGraham = in.readObject().asInstanceOf[Person]
  val savedJenny = in.readObject().asInstanceOf[Person]

  println(savedDiego.friends.mkString(", "))
  println(savedColm.friends.mkString(", "))
  println(savedGraham.friends.mkString(", "))
  println(savedJenny.friends.mkString(", "))

  //TODO: check object with ==
}
