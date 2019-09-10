package com.atguigu.scala.day05.witch

import scala.io.StdIn

object MatchObj {

  def main(args: Array[String]): Unit = {

    /*val Name = "lisi"
    val op = StdIn.readLine("please input: ")
    op match {
      case "1" => println("1")
      case "2" => println("3")

      case op if (op != 10) => println("是正确的输入。。。")//加守卫
      case a => println(s"$a"+ " haha")
      case Name => println("lisi")
      case _ => println("nothing")
    }*/

    /*val ints = Array(34,65,17,98,33,10)
    val list = List(3,3,6,5)
    val map = Map(1-> "zhangsan",2->"lisih" ,3-> "haha")
    matchType(map)*/


    //matchObj(List(2,9,5))

   /* val r: Double = 110
    r match {
      case Square(r) => println("it is :" + s"  $r")
    }*/

    val name:String = "zhangsan,lisi,wangwu,zhaoliu"
    name match {
      case matchQueue(one,ss,dd,four) => println("you get the right and the value is : "+ s"  $dd, $ss" )
    }

  }

  /**
    * 匹配类型
    */
def matchType (op : Any): Unit = {
  op match {
    case oo : Array[Int] => println("it is a Array...")
    case ll : Map[Int,String] => println("it is a Map...")
    case _ => println("it is nothing ...")
  }
}

  /**
    * 匹配内容
    */
    def  matchObj (op : Any): Unit = {
      op match {
        //case List(2,op@_*) => println("it is the target List..")
        case List(2,op@_*) => println(op.mkString(" "))
        case _ =>println("it is not the right match....")
      }
    }

  /**
* 匹配对象
*/
object Square {
  def unapply(r: Double): Some[Double] = Some(math.sqrt(r))//sqrt传参为Double
}


}
/**
  * 匹配对象--匹配队列
  */
object matchQueue{
  def unapplySeq(op :String): Option[Array[String]] ={//注意这里返回值一定要一致
    if (op.length == 0) None
    else Some(op.split(","))
  }
}
