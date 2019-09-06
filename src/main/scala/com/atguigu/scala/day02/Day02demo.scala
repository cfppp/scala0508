package com.atguigu.scala.day02

object Day02demo {

  def main(args: Array[String]): Unit = {
    //operation(Array(1,2,3), _ + 2)

    /* var arr = map(Array(1,2,3,4), x => x* x )
     println(arr.mkString(" , "))*/


    /* val a = reduce(Array(1, 2, 3, 4, 5, 6), (x, y) => x + y)
     println(a)*/

    /*var arr = incepter(Array(1,3,2,5,4,76,45), x => x % 2 == 0)
    println(arr.mkString(", "))*/

    //chenfa

    //val a = pingfang

    /*add(1,2,3,4)
    add(1 to 100 : _*)
    add(Array[Int](1,2,3):_*)*/

    /*val c = hiveDefault(a = 3, c = 4)
    val h = hiveDefault( a = 2, b = 3, c = 7)
    println(c)*/

    //sumZhishu

    //sum

    /*val arr = cdf(Array(1,2,3),x => x+2)
    println(arr.mkString(","))*/

    /*val arr = pingfang(Array(1,2,3,4), x => x * x )
    println(arr.mkString(" "))*/

    /*val ii = reduce1(Array(1,2,3,4), (x,y ) => x*x  + y*y  )
    println(ii)*/

   /* val a = jiecheng(6)
    println(a )*/




  }


  /**
    * 抽象控制
    */
  def loop(n: Int)(op: => Unit): Unit = {
    if (n > 0) {
      op
      loop(n - 1)(op)
    }
  }



  /**
    * 递归求n！
    */
  def jiecheng(n : Int): Int ={
    if( n == 1) return 1
    else{
      n * jiecheng (n - 1)
    }
  }
  /**
    * 使用reduce
    */
  def reduce1(arr :Array[Int],op : (Int,Int) => Int): Int ={
    var sum= arr(0)
    for ( i <- 1 until arr.length ){
      sum = op(sum,arr(i))
      //sum += arr(i)
    }
    sum
  }

  /**
    * 给数组执行平方操作
    */
  def pingfang(arr: Array[Int],op: Int => Int): Array[Int] ={
     for (i <- arr) yield op(i)
  }

  /**
    * 函数传递(给数组加2操作)
    */
  def cdf(arr: Array[Int] , op : (Int) => Int) ={
    for (i <- arr) yield op(i)
  }

  /**
    * 求100-1000之和
    */
  def sum (): Unit ={
    var sum = 0
    for(i <- 100 to 1000){
      sum += i
    }
    println(sum )
  }
  /**
    * 100-1000之间的所有质数之和
    */
  def sumZhishu(): Unit = {
    /*var arr = for ( i <- 100 to 1000 if isZhishu(i)) yield i
    println(arr.mkString(","))*/
    var sum = 0
    for (i <- 100 to 1000 if isZhishu(i)) {
        sum += i
    }
    print(sum )
  }

  def isZhishu(i: Int): Boolean = {
    if (i == 1) return false
    for (j <- 2 to i - 1 if i % j == 0) {
      return false
    }
    true
  }

  /**
    * 调用有默认值的函数
    */
  def hiveDefault(a: Int, b: Int = 8, c: Int): Int = {
    a + b * c
  }


  /**
    * 可变参数
    */
  def add(arr: Int*): Unit = {
    var sum = 0
    for (i <- arr) {
      sum += i
    }
    println(sum)
  }


  /**
    * 匿名函数示例1
    *
    * @param i
    */
  def op(i: Int): Unit = {
    println(i * i)
  }

  def operation(arr: Array[Int], op: Int => Unit): Unit = {
    for (i <- arr) {
      op(i)
    }
  }

  /**
    * 匿名函数示例2
    */
  def map(arr: Array[Int], op: Int => Int) = {
    for (i <- arr) yield op(i)
  }

  /**
    * 匿名函数示例3
    * reduce应用
    */
  def reduce(arr: Array[Int], op: (Int, Int) => Int): Int = {
    var sum = 0
    for (i <- arr) {
      sum = op(sum, i)
    }
    sum
  }

  /**
    * 匿名函数示例4
    * 写一个拦截器
    */
  def incepter(arr: Array[Int], op: Int => Boolean): Array[Int] = {
    for (i <- arr if op(i)) yield i
  }

  /**
    * 99乘法表
    */
  def chenfa(): Unit = {
    for (i <- 1 to 9) {
      for (j <- 1 to i) {
        print(s" $j * $i = ${j * i} ")
      }
      println()
    }
  }

  /**
    * for推导
    */
  def pingfang(): Unit = {
    val arr = for (i <- 1 to 9) yield i * i
    println(arr.mkString(" ,"))
  }
}
