package junwei.scala.junwei.scala

object Methord {
  def main(args: Array[String]): Unit = {
    def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int = (x + y) * multiplier
    println(addThenMultiply(1, 2)(3))
    def name: String = System.getProperty("user.name")
    println("Hello, " + name + "!")
  }
}
