package com.fwx.scala

object D14_Recursive {
  /**
    * 递归
    *     1. 找到递归的算法
    * f(5)=5*f(5-1)
    * f(n)=n*f(n-1)
    *     2. 在递归函数内部, 一定要有结束条件
    *     3. 随着递归的深入, 要有机会到达结束条件
    *
    * 尾递归:
    * scala会对尾递归做一个优化, 尾递归优化. 就不会出现StackOverflowError
    *
    * 在递归的时候, 只有递归, 没有任何其他的运算, 这就是尾递归
    * scala做了优化(迭代算法), java没有
    *
    * 要要找到一个合适的累加器
    * 走到最深层的时候, 结果出来之后,也是最后结果
    *
    * 1 + 2 + 3...+100
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    //println(recursive(100000))
    println(recursive(10))
    println(lastRecursive(10, 1))
  }

  /**
    * 普通递归
    *
    * @param num
    * @return
    */
  def recursive(num: Int): Int = {
    if (num == 1) 1
    else num * recursive(num - 1)
  }

  /**
    * 尾递归
    *
    * @param num
    * @param tempResult
    * @return
    */
  def lastRecursive(num: Int, tempResult: BigInt): BigInt = {
    if (num == 1) tempResult
    else lastRecursive(num - 1, num * tempResult)
  }
}
