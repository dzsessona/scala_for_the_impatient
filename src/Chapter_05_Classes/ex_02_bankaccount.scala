package Chapter_05_Classes.ex2

class BankAccount{
  private var balance_ : Double =0.0
  def balance = balance_

  def deposit(amount: Double) = {
    balance_ += amount
  }
  def withdraw(amount:Double) = {
    balance_ -= amount
  }
  def showStatus() :Unit ={
    println("You have " + balance + " euro on your account")
  }
}

object Main extends App{
  val account = new BankAccount
  account.deposit(500.0)
  account.showStatus()
  account.balance
  account.withdraw(100.0)
  account.showStatus()
  account.balance
}