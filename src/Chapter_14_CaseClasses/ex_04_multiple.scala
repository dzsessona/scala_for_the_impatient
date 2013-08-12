package Chapter_14_CaseClasses.ex4

abstract class Item
case class Article(desc:String, price:Double) extends Item
case class Boundle(desc:String, discount:Double,item:Item*) extends Item
case class Multiple(count:Int, item:Item) extends Item



object Main extends App{

  def price(item:Item):Double = item match{
    case a:Article => a.price
    case Boundle(des,dis,items @ _*) => items.map(price(_)).sum - dis
    case Multiple(c,i) => c * price(i)
  }

  val x = Boundle("Father's day special", 20.0,
    Multiple(3, Article("Scala for the Impatient", 39.95)),
    Boundle("Anchor Distillery Sampler", 10.0,
      Article("Old Potrero Straight Rye Whiskey", 79.95),
      Article("Junípero Gin", 32.95)
    )
  )

  println(price(x))
}