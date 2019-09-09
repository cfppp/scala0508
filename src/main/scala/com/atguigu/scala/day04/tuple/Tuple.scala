package com.atguigu.scala.day04.tuple

object Tuple {


  def main(args: Array[String]): Unit = {

    val tuple = (1,"hh")
    println(tuple)
    println(tuple._1)

    val result = hh(10,3)
    println(result)
    println(result._1)
    println(result._2)
    for (elem <- result.productIterator) {
      println(elem)
    }


  }

  def hh (a : Int,b : Int): (Int,Int) ={
    (a / b, a % b)
  }

}
