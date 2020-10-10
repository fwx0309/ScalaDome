package com.fwx.scala

object D16_Controlables {

  /**
    * 调用函数传值的时候有两种方式:
    * 1. 默认都是值传递(值调用)
    *
    * 2. 名传递(名调用)
    * 传递的是代码,而不是计算后的值
    * 在函数内部, 用一次, 传递过来的代码就会执行一次
    */
  def main(args: Array[String]): Unit = {
    value(fun())
    name(fun())
  }

  /**
    * 普通方法
    *
    * @return
    */
  def fun() = {
    println("action...")
    10
  }

  /**
    * 值调用方法
    *
    * @param a
    */
  def value(a: Int) = {
    println(a)
    println(a)
    println(a)
  }

  /**
    * 名调用方法
    *
    * @param a
    */
  def name(a: => Int) = {
    println(a)
    println(a)
    println(a)
  }
}
