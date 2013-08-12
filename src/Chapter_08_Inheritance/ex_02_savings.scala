package Chapter_08_Inheritance.ex2

class BankAccount(initialBalance: Double) {
  private var _balance = initialBalance
  def balance():Double = _balance
  def deposit(amount: Double) = { _balance += amount; _balance }
  def withdraw(amount: Double) = { _balance -= amount; _balance }
  override def toString = "Balance = %f".format(balance)
}

class SavingAccount(initialBalance: Double,freeTransaction:Int ,interests:Double= 0.20, charge:Double = 1.0) extends BankAccount(initialBalance)   {
  var transactionThisMonth = 0
  def isFreeTransaction():Boolean ={freeTransaction >= transactionThisMonth }
  override def deposit(amount:Double)={
    transactionThisMonth += 1
    isFreeTransaction() match{
      case true => println("deposit of "+amount+" (free)");super.deposit(amount)
      case false => println("deposit of "+amount+" (not free)");super.deposit(amount - charge)
    }
  }
  override def withdraw(amount:Double)={
    transactionThisMonth += 1
    isFreeTransaction() match {
      case true => println("withdraw of "+amount+" (free)");super.withdraw(amount)
      case false => println("withdraw of "+amount+" (not free)");super.withdraw(amount + charge)
    }
  }
  def earnMonthlyInterests(){
    transactionThisMonth = 0
    println("Earned interests for this month!!!")
    super.deposit((balance * interests)/12)
  }
}

object Main extends App{
  val savings = new SavingAccount(500.0,3)
  savings.deposit(100)
  println(savings)
  savings.deposit(100)
  println(savings)
  savings.deposit(100)
  println(savings)
  savings.deposit(100)
  println(savings)

  //next month
  savings.earnMonthlyInterests()
  println(savings)
  savings.deposit(100)
  println(savings)
}

