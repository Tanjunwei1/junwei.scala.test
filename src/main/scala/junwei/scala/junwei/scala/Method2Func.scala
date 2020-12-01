package junwei.scala.junwei.scala

object Method2Func extends  App {

  def t(n:Int): Unit ={
    println("this is method")
  }
  val a = t _
  a(1)
}
