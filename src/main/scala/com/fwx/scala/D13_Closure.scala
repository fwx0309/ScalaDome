package com.fwx.scala

object D13_Closure {
  /**
    * 闭包:
    * 一个函数, 如果访问了外部的局部遍历,则这个函数和他访问的局部遍历, 称为一个闭包
    * 闭包会阻止外部局部遍历的销毁, 可以把局部变量的使用延伸到函数
    */
  def main(args: Array[String]): Unit = {
    val cFun = closure()
    println(cFun(10))   // 能够访问到a, 是因为闭包的存在
  }

  def closure() = {
    val a = 5;
    (b: Int) => {a + b}
  }
}
