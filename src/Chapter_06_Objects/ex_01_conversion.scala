package Chapter_06_Objects.ex1

object Conversion extends App{
  def inchesToCentimeters(inches:Double):Double =  inches * 2.54
  def GallonsToLiters(gallons:Double):Double =  gallons * 3.78
  def MilesToKilometers(miles:Double):Double =  miles * 1.61

  println("one inch is equal to cm: " + inchesToCentimeters(1.0))
  println("one gallon is equal to l: " + GallonsToLiters(1.0))
  println("one mile is equal to km: " + MilesToKilometers(1.0))
}
