//package junwei.scala.junwei.scala
import java.awt.Color

import scala.collection.{LinearSeq, SortedSet, generic, immutable, mutable}

object collection {
  def main(args: Array[String]): Unit = {

    def p(n : Int): Unit ={
      println(s"demo ${n}")
    }
    val a :Iterable[String] =  Iterable("x", "y", "z")
    a.foreach( n => println(n))
    println("demo 1")
    //xs ++ ys	生成一个由xs和ys中的元素组成容器。ys是一个TraversableOnce容器，即Taversable类型或迭代器
    val b :Iterable[String] =  Iterable("a", "b", "c")
    (a++b).foreach(n=>println(n))
    println("demo 2" )

  //xs map f	通过函数xs中的每一个元素调用函数f来生成一个容器。
    a.map(n => n+"dddd").foreach(n => println(n))
    p(3)
//xs flatMap f	通过对容器xs中的每一个元素调用作为容器的值函数f，在把所得的结果连接起来作为一个新的容器
    val e:Iterable[String] = Iterable("axff", "ycsc", "zx");
e.flatMap(a=>a+"~").foreach(n => println(n))
p(4)


    //xs collect f	通过对每个xs中的符合定义的元素调用偏函数f，并把结果收集起来生成一个集合。
    val F:Iterable[Int] = Iterable(1, 2, 3, 4, 5, 6, 7, 8, 0, 9);


    Map("x" -> 24, "y" -> 25, "z" -> 26).map(_._2==25)

    Set(Color.red, Color.green, Color.blue)

    SortedSet("hello", "world")

    //mutable.Buffer(x, y, z)


    IndexedSeq(1.0, 2.0)

   // LinearSeq(a, b, c)
  }
}
