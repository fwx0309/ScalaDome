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

    // 1.将方法转成函数
    val res1 = hoFunction(fun _)
    res1()

    // 2.直接声明函数
    // 函数不能声明返回值类型, 只能靠推导
    val f: () => Unit = () => println("f")
    val res2 = hoFunction(f)
    res2()

    // 3.匿名函数:
    /**
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
      */
    println(result((a: Int, b: Int) => a + b)(1, 2))
    println(result(_ + _)(1, 2))
    println(result(_ * _)(1, 2))

    // 4.filter Demo
    val array = (1 to 10).toArray
    println(filterDemo(array, (a: Int) => a > 5).mkString(","))
  }

  /**
    * fun 普通函数
    */
  def fun() = {
    println("function!")
  }

  /**
    * hoFunction 高阶函数
    *
    * @param x
    */
  def hoFunction(x: () => Unit) = {
    //x()
    println(x)
    x
  }

  /**
    * fun 高阶函数
    *
    * @param op
    * @return
    */
  def result(op: (Int, Int) => Int) = {
    println(op)
    op
  }

  /**
    * @param arr 需要过滤的数据
    * @param op  过滤规则
    * @return
    */
  def filterDemo(arr: Array[Int], op: (Int) => Boolean) = {
    for (elem <- arr if (op(elem))) yield elem
  }
}
