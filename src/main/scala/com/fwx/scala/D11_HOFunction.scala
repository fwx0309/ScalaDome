package com.fwx.scala

object D11_HOFunction {
  /**
    * 高级特性:
    *
    * 1. 函数可以定义在任何位置.
    * 可以在函数内定义函数
    *
    * 2. 可以把函数当成一个值返回给函数的调用者,
    * 函数的调用者就可以在函数的外部去调用这个返回的函数
    *
    * 3. 可以把函数当做一个值, 传递给另外一个函数.
    *
    * 4. 如果一个函数f 可以返回一个函数作为返回值, 或者可以接受一个(多个)函数作为参数,
    * 那么这个函数f就称为高阶函数!!!
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {

    // 将方法转成函数
    val res1 = hoFunction(fun _)
    res1()

    // 直接声明函数
    // 函数不能声明返回值类型, 只能靠推导
    val f: () => Unit = () => println("f")
    val res2 = hoFunction(f)
    res2()

    val op: (Int, Int) => Int = (a: Int, b: Int) => a + b
    println(result(op)(1, 2))
  }

  /**
    * 普通函数
    */
  def fun() = {
    println("function!")
  }

  /**
    * 高阶函数
    *
    * @param x
    */
  def hoFunction(x: () => Unit) = {
    //x()
    println(x)
    x
  }

  def result(op: (Int, Int) => Int) = {
    println(op)
    op
  }
}
