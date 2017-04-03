package com.thomsonreuters.cdb.scala.study

import scala.collection.mutable.ArrayBuffer

object TestArray {


  def main(args: Array[String]) = {
    val b = ArrayBuffer[Int]()
    
    b+=1
    
    println(b)
    
    b+=(1,2,3,5)
    
    println(b)
    
    b++=Array(8,13,21)
    
    println(b)
    
    b.trimEnd(5)
    
    println(b)

  }

}