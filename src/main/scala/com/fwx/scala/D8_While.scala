package com.fwx.scala

object D8_While {
  def main(args: Array[String]): Unit = {
    /**
      * while
      */
//    var i = 0
//    while (i < 10) {
//      println(i)
//      i += 1
//    }

    /**
      * do while
      */
//    var j = 0
//    do {
//      println(j)
//      j += 1
//    } while (j < 10)

    /**
      *
      */
    var index = 0
    val result = while (index<=10){
      index+=1
      index
    }
    println(result)
  }
}
