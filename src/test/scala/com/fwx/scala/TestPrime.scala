package com.fwx.scala

object TestPrime {
  def main(args: Array[String]): Unit = {
    var filterArr = filterFun((1 to 4).toArray, isPrime)
    println(s"reduceFun(filterArr,_ + _) = ${reduceFun(filterArr, _ + _)}")
  }

  /**
    * 判断是否是质数
    *
    * @param x
    * @return
    */
  def isPrime(x: Int): Boolean = {
    for (i <- 2 until x) {
      if (x % i == 0) {
        return false
      }
    }
    true
  }

  /**
    * 数组数据过滤
    *
    * @param arr
    * @param op
    * @return
    */
  def filterFun(arr: Array[Int], op: Int => Boolean) = {
    for (elem <- arr if (op(elem))) yield elem
  }

  /**
    * 数据聚合
    *
    * @param arr
    * @param op
    * @return
    */
  def reduceFun(arr: Array[Int], op: (Int, Int) => Int) = {
    var result = arr(0)
    if (arr.size > 1) {
      for (i <- 1 until arr.size) {
        result = op(result, arr(i))
      }
    }
    result
  }
}
