package com.atguigu.scala.day03.abs

class Myclass {
  def main(args: Array[String]): Unit = {
    new Person("zhangsan",2)
  }


  abstract class Human(val name : String){
    val age : Int
    var sex : String
    def say (a: Int) : Long
  }

  class Person(override val name :String,id : Long) extends Human (name ) {
    override val age: Int = 10

    override var sex: String = _

    override def say(a: Int): Long = {
      print("foo...")
      22
    }
  }
}
