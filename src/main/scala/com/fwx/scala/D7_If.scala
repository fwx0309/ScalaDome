package com.fwx.scala

object D7_If {
  /*
java:  ? : , scala去掉三元算符

重要:
    在scala中, 任意的语法结构(执行的语句, 表达式等等)都有值!!!
    是执行的最后一样代码的值自动返回
    注意:在scala中, 赋值的语句的值是Unit  (+= -=...)

流程控制:
    1. 顺序流程
    2. 分支
        java:
            if分支
                if
                if.. else if
                if.. else if else
                    ...
            switch 分支
                switch(表达式){
                    case 常量:
                        break;
                    default:
                        break;
                }
             缺点:
                1. 类型有限
                    byte short char int String(1.7增加) enum

                2. case穿透
                    忘记break, 会出现

         scala:
            if
                和java的if的使用完全一致! java怎么用, scala还怎么用!

            模式匹配:
                替换掉java的switch, 语法有点像, 但是远远超过java的switch

    3. 循环
 */
  def main(args: Array[String]): Unit = {
    val m = 100
    val n = 50
    val r = if (m > n) 1000 else 1
  }
}
