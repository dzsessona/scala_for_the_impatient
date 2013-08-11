package Chapter_06_Objects.ex2

object conversionRates extends Enumeration{
  val Inches = 2.54
  val Gallon = 3.78541
  val Mile = 1.60934
}
abstract class UnitConversion{
  def convert(unit: Double): Double
}
object InchesToCentimeters extends UnitConversion {
  def convert(inches: Double): Double = inches * conversionRates.Inches
}
object GallonsToLiters extends UnitConversion {
  def convert(gallons: Double): Double = gallons * conversionRates.Gallon
}
object MilesToKilometers extends UnitConversion {
  def convert(miles: Double): Double = miles * conversionRates.Mile
}

object Main extends App{
  println("4 inches are equal to cm: " + InchesToCentimeters.convert(4.0))
  println("4 gallons are equal to l: " + GallonsToLiters.convert(4.0))
  println("4 miles are equal to km: " + MilesToKilometers.convert(4.0))
}