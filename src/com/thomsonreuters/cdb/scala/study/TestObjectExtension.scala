package com.thomsonreuters.cdb.scala.study

abstract class UndoableAction(val description: String)
{
  def undo(): Unit
  def redo(): Unit
  def printdescription()
  {
    System.out.println(description);
  }
}

object UndoableAction extends UndoableAction("Do nothing") {
  override def undo() {}
  override def redo() {}
  
   def main(args: Array[String]) = {
     System.out.println(description)
   }
}

