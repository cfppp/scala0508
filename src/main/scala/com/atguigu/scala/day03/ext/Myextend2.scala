package com.atguigu.scala.day03.ext

object Myextend2 {

  def main(args: Array[String]): Unit = {

    val dd = new Circle(3,4,5)
    val ee = new Circle(0,0,0)
    println(dd.r(ee))
    println(dd.s)

  }


  /**
    * 定义一个点
    * 并且有一个求距离的函数
    */
  class Point (val x : Double,val y : Double) {

    def r (other : Point): Double =
      math.sqrt((this.x - other.x)*(this.x - other.x)
      + (this.y - other.y )*(this.y - other.y ))


  }

  class Circle (override val x : Double,override val y : Double,r : Double) extends  Point (x,y ){

    //override def  toString: String = s"x : $x, y : $y, r :$r "
    def s = math.Pi*r*r
  }



}
