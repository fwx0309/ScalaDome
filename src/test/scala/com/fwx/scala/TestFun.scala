package com.fwx.scala

object TestFun {
  def main(args: Array[String]): Unit = {
    fun(add)
    fun((a: Int, b: Int) => 10)
  }

  def fun(op: (Int, Int) => Int): Unit = {
    println(op(1, 2))
  }

  def add(a: Int, b: Int): Int = {
    a + b
  }
}
