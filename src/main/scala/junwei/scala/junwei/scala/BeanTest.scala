package junwei.scala.junwei.scala

import scala.annotation.meta._
import scala.beans.BeanProperty

object BeanTest extends App {
class dog() {
  @BeanProperty var name = "asd"
}
  var  d = new dog()
  println(d.getName())
  d.setName("ggggg")
  println(d.getName)
}
