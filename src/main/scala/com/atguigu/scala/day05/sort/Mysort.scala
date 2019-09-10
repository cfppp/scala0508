package com.atguigu.scala.day05.sort

object Mysort {

  def main(args: Array[String]): Unit = {

   /* val users : List[User]= List(new User("zhangsan",3),new User("wangwu",17),new User("lisi",20))
    println(users.sorted)*/

    /*val list = List(23,45,76,23,21,54,97,1)
    println(list.sorted)
    println(list.sorted.reverse)
*/

   /* val list = List(23,45,76,23,21,54,97,1)
    println(list.sortBy(x => x).reverse)*/

    val users : List[User]= List(new User("zhangsan",3),
      new User("zhaoliu",20),new User("wangwu",17),new User("lisi",20))
    println(users.sortBy(user => user.age))
    println(users.sortBy(user => (user.age,user.name)).reverse)
    println(users.sortBy(user => (user.age,user.name))(Ordering.Tuple2(Ordering.Int,Ordering.String)))



}




class  User (val name: String,val age : Int) extends Comparable[User] {

override def compareTo(o: User): Int = {
var comp = this.age - o.age
if (comp == 0) {
 comp =  this.name.compareTo(o.name)
}
comp
}

override def toString = s" $name,$age"
}

}
