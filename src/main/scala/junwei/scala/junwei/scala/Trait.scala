package junwei.scala.junwei.scala

object Trait {
  def main(args: Array[String]): Unit = {




    class Cat(name:String) extends  animal{
      override def sleep(name: String): Unit = {
        super.sleep(name+"this is override attr")




      }
      def attr(): Unit ={
        println(s"this is cat's attr")
      }
    }
    val cat:Cat = new Cat("Jim")
    cat.sleep("now");
    cat.attr();

  }
  trait animal{
    def sleep(name:String): Unit ={
      println(s"${name} need to sleep")
    }
  }

}
