package com.atguigu.scala.day03.ext

object Myextend {

  def main(args: Array[String]): Unit = {

    val person =  new BB
    println(person.n)
    println(person.age)

  }


  class Person {


    def say: Unit ={
      println("father...")

    }
  }

  class Stu extends Person {

    override def say: Unit = {
      println("son...")
    }
  }

  class AA (val age:Int) {
    def n : Int =10
  }

  class BB extends AA (5){
    override val age: Int = 20

    override val n: Int = 30


  }

}
