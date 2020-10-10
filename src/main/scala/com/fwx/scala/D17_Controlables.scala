package com.fwx.scala

object D17_Controlables {
  /**
    * 利用递归、名调用、柯里化来实现一个类型while循环的功能
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    var n = 5
    loop(n < 10){
      println(n)
      n += 1
    }

  }

  def loop(condition: =>Boolean)(op: => Unit):Unit = {
    if(condition) {
      op
      loop(condition)(op)
    }
  }
}
