package Chapter_05_Classes.ex10

class Employee {
  private var _name = "Diego Zambelli"
  def name = _name
  var salary = 0.0

  def this(name: String, salary: Double) {
    this()
    _name = name
    this.salary = salary
  }
}
