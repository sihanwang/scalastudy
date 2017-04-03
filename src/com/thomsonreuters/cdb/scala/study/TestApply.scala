package com.thomsonreuters.cdb.scala.study

class TestAccount private (val id: Int, initialBalance: Double) 
{
  private var balance = initialBalance
 
}

object TestAccount 
{
  def apply(initialBalance: Double)=
  {
    new TestAccount(newUniqueNumber(), initialBalance)
  }
  
  private var lastNumber=0
  
  def newUniqueNumber() = 
  { 
    lastNumber +=1
    lastNumber
  } 
}