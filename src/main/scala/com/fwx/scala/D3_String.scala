package com.fwx.scala

object D3_String {
  def main(args: Array[String]): Unit = {
    println("""
              | 多行
              | 字符串
            """.stripMargin)
    /**
      * 1. java的输出
      */
    System.out.println("1. java的输出")

    /**
      * 2. scala的输出
      */
    println("2. scala的输出")

    /**
      * 3. printf 格式化输出
      */
    println("3. printf 格式化输出")
    // %d 输出整数
    printf("整数：%d\n",10)
    // %s 输出字符串
    printf("整数：%f\n",math.Pi)
    printf("整数：%.2f\n",math.Pi)
    // %f 输出浮点数
    printf("字符串: %s, %f, %d\n", "abc", 1.2, 1)

    /**
      * 4. s插值
      */
    println("4. s插值")
    val a = 10
    val b = 20
    val res1 = s"a = $a, b = $b"
    println(res1)
    val res2 = s"a = ${a*2}, b = $b"
    println(res2)

    /**
      * 5. raw 插值
      */
    println("5. raw 插值")
    val res3 = raw"\n \t \s"
    println(res3)
  }
}
