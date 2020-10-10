package com.fwx.scala

object D15_Currying {
  /**
    * 柯里化!
    * 1. 普通函数->高阶函数->柯里化
    * 2. 把函数的一个参数列表, 变成多个参数列表的过程, 就是柯里化!
    * 3. 一般:第一个列表是必须传递, 第二个列表内的一般是隐式参数!!(scala会自动帮我们找到对应的隐式值传递)
    * 4. 柯里化的理论基础是闭包
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println(add(1, 2))
    println(addCurrying(1)(2))
  }

  /**
    * 普通方法
    *
    * @param a
    * @param b
    * @return
    */
  def add(a: Int, b: Int) = {
    a + b
  }

  /**
    * 柯里化方法
    * @param a
    * @param b
    * @return
    */
  def addCurrying(a: Int)(b: Int) = {
    a + b
  }
}
