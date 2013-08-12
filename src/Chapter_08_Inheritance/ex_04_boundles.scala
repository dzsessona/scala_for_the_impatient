package Chapter_08_Inheritance.ex4

abstract class Item{
  def price(): Double
  def description(): String
  override def toString =  "%s[%s: %f]".format(this.getClass.getSimpleName, description, price)
}

//class SimpleItem(pr:Double, desc:String) extends Item{
//  def price():Double = pr
//  def description():String = desc
//}
//a val can override a def
class SimpleItem(override val price:Double, override val description:String) extends Item

class Boundle extends Item{
  private var items: List[Item] = Nil
  def price():Double = {items.map(_.price).sum }
  def description(): String ={items.map(_.description).mkString(", ")}
  def addItem(item:Item) :Unit = {items = item :: items}

}

object Main extends App {
  val boundle = new Boundle
  boundle.addItem(new SimpleItem(100.0, "phoe"))
  boundle.addItem(new SimpleItem(100.0, "anoth"))
  boundle.addItem(new SimpleItem(100.0, "kodsafjao"))
  print(boundle)
}