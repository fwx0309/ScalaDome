package com.fwx.scala

/**
  * 执行代码：
  *   java：定义类，然后在类中定义一个静态的main方法，使用类调用main方法。
  *   scala：没有静态概念。类名前object修饰，表明该类的对象，使用对象调用main方法。
  */
object D1_HelloWorld {
  def main(args: Array[String]): Unit = {
    System.out.println("java:Hello world!")
    println("scala:Hello world!")
  }
}
