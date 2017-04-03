package com.thomsonreuters.cdb.scala.study

object Hello {
  def main (args: Array[String])
  {
    println("Hello world!")
  }
  
}


//scala -Dscala.time HelloApp Fred
object HelloApp extends App {
  if (args.length >0)
    println("Hello, "+ args(0))
  else
    println("Hello world")

}
