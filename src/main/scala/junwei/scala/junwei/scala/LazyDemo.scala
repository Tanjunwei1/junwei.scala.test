package junwei.scala.junwei.scala

object LazyDemo extends  App {

  def  sum(a:Int,b:Int) = {
  println("sum was running")
    a+b
  }

  lazy val res = sum(10,20)
  println("------------------")
  println(res)

}
class persion private(){
  def this(name: String) = {
    this //一定要先调用主构造器
    name
  }


}
