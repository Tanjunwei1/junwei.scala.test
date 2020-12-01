package junwei.scala.junwei.scala

object AnonymousFunc {
  def main(args: Array[String]): Unit = {
    val  a = (n:Int)=>n*n
    print(a(10))
  val b = ()=>44
    println(b())
  }
}
