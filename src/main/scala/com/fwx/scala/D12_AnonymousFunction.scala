package com.fwx.scala

object D12_AnonymousFunction {
  /**
    * 1. 匿名函数:
    * 没有名字的函数, 就是匿名函数
    * 用处:
    *         1. 作为实参, 直接传递给高阶函数
    *         2. 直接作为高阶函数的返回值
    * 2. 传递:
    * foo((a:Int, b:Int) => a + b)
    *
    * 3. 在传递匿名函数的时候, 参数的类型一般可以利用上下文, 让scala去自动推导
    *
    * 4. f(_ + _)
    * 要求: 1. 匿名只能有两个参数
    *          2. 每个参数只使用了一次
    *          3. 第一个_表示第一个参数, 第二个下划线表示第二个参数
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println(hoFunction((a, b) => a + b))
    println(hoFunction((a, b) => a * b))
  }

  def hoFunction(op:(Int,Int)=>Int)={
    op(2,4)
  }
}
