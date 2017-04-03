package com.thomsonreuters.cdb.scala.study

object TestEnoumeration extends Enumeration {
   val Red, Yellow, Green = Value

  def main (args: Array[String])
  {
    println(Red.id)
    println(Yellow.id)
    println(Green.id)
    
    for (c <- TestEnoumeration.values) println(c.id+":"+c)
    
   
    println(TestEnoumeration(0)) //call Enumeration.apply
    println(TestEnoumeration.withName("Red"))
      
  }
}

