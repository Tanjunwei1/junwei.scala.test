package junwei.scala.junwei.scala

object CaseClass {
  def main(args: Array[String]): Unit = {
    //你可以不用new关键字来实例化样例类
    case class dog(name:String){
      def fee(): Unit ={
        println("-_-")
        println(name)
      }
    }
    val c = dog("gg")
    c.fee()
  }
}
