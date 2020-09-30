package com.fwx.scala

import scala.util.control.Breaks._

object D9_For {
  def main(args: Array[String]): Unit = {
    /**
      * for
      */
//    for (e <- 1 to 10 ){
//      println(e)
//    }

    /**
      * for 设置步长
      */
//    for (e <- 1 to 10 by 2 ){
//      println(e)
//    }

    /**
      * for reverse
      */
//    for (e <- 1 to 10 reverse ){
//      println(e)
//    }

    /**
      * for 守卫
      */
//    for (e <- 1 to 10 if e>5;if e%2==0 ){
//      println(e)
//    }

    /**
      * for 循环退出
      */
//    breakable{
//      for (i <- 1 to 10){
//        if (i==5){
//          break
//        }
//        println(s" i= ${i}")
//      }
//    }

    /**
      * for yield
      */
    val data = for (i <-1 to 10) yield  i + 1
    println(data.mkString(","))
  }
}
