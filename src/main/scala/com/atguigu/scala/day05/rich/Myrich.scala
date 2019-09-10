package com.atguigu.scala.day05.rich




import java.io.File

import scala.io.Source


object Myrich {


  def main(args: Array[String]): Unit = {

    //val aa : Int = 34.6
    implicit  def transfer (file : File):FichFile = new FichFile(file)
      val path : String = "M:\\intelliJ\\local\\scala0508\\src\\main\\scala\\com\\atguigu\\scala\\day05\\rich\\Myrich.scala"
       val file = new File(path).readContent
      println(file)


  }

  /**
    * 隐式转换函数
    */
    implicit def double2Int (oo : Double): Int = {
      oo.toInt
    }
    class  FichFile (file : File) {
        def readContent: String = Source.fromFile(file).mkString
    }
  /**
    * 隐式类
    */

  /**
    * 隐式参数与隐式值
    */
}
