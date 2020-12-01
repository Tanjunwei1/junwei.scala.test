package junwei.scala.junwei.scala

import scala.concurrent.ExecutionContext

object CurryingTest {
  def main(args: Array[String]): Unit = {
  var a =   List(1,2,3)
    implicit def  c(b:Int) = {
      List(b)
    }
    var b = 3

    a = a ::: b
    a.foreach(println)

  }



  trait Iterable[A] {
    def foldLeft[B](z: B)(op: (B, A) => B): B

  }

}
