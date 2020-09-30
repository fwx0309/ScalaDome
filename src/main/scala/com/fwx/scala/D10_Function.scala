package com.fwx.scala

object D10_Function {

  /**
    * 1. 函数的返回值类型可以省略, 然后scala会根据最后一行代码, 推导出来函数的返回值类型
    * 一般都是省略
    * 有些情况不能推导:
    *         1. 如何函数内有return语句, 则类型不能推导
    *         2. 返回值类型和推导类型不一致的时候, 不要推
    *         3. 递归调用的时候不能推
    *
    * 2. 如果函数签名和函数体之间的 = 省略, 那么这个函数用于返回 Unit (隐式的返回Unit)
    * 函数就成了一个过程
    *
    * 3. 如果函数显示指明返回Unit, 则用于返回Unit
    *
    * 4. 调用函数的时候, 如果函数的参数的个数是0,则愿括号可以省略
    *
    * 5. 在声明函数时候, 如果不需要参数, 则愿括号也可以省略. 调用时候, 就不能再有愿括号
    *
    * 6. 函数的参数默认都是val, 所以, 在函数内部不能更改参数的值!!!!
    * 如果想修改参数的值, 则应该定义一个新的局部变量, 然后去修改局部变量的值!
    *
    * 7. 声明函数的时候, 参数可以带默认值
    * def add(a:Int, b:Int, c:Int = 3) = a + b + c
    *
    * 8. 在java和scala中, 默认传递函数参数, 是按照位置来的.
    * scala中一种另外传递参数的方式: 命名参数
    * add(10, c = 100)
    * add(c = 100, a = 10, b = 20)
    *
    * 9. scala 也支持可变参数
    * def add(xs: Int*)
    * xs在函数的内部, 可以当做一个数组来处理
    * 给可变参数传递集合的时候, 可以使用下划线展开
    * val arr = 1 to 100
    * println(add(arr: _*))
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //println(num(1))

    add(1, c = 2)
    add(1, 2, 3)

    println(adds(1 to 10: _*))  //这种情况必须在后面写上: _*将1 to 10转化为参数序列
  }

  /**
    * @param a
    * @return
    */
  def num(a: Int) = {
    var b = a
    //a=10
    b = 10
    b
  }

  /**
    * add
    * @param a
    * @param b
    * @param c
    */
  def add(a: Int, b: Int = 10, c: Int ) = {
    println(s"a + b + c = ${a + b + c}")
  }

  /**
    * adds
    * @param nums
    */
  def adds(nums:Int*)= {
    var temp = 0
    for (elem <- nums) {
      temp +=elem
    }
    temp
  }
}
