package Chapter_07_Packages.ex9

import java.lang.System

object Main extends App {
  val userName = System.getProperty("user.name")

  val password = System.console.readLine.toString

  if (password != "secret")
    println("Password is not secret!")
  else
    println("Welcome to the system!")
}