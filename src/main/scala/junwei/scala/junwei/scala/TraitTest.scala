package junwei.scala.junwei.scala

object TraitTest {
  def main(args: Array[String]): Unit = {

    val test = new Test("JunweiTan");
    println(test.write)
    println(test.read)
  }
  trait Iterator[A] {
    def hasNext: Boolean
    def next(): A
  }
  trait Iter[B]{
    def write:Int
    def read:String

  }

  class Test(in:String) extends Iter[String]{
    private var value = "asd";

    override def read: String = {
    return in
    }

    override def write: Int = 1
    }
  class IntIterator(to: Int) extends Iterator[Int] {
    private var current = 0
    override def hasNext: Boolean = current < to
    override def next(): Int =  {
      if (hasNext) {
        val t = current
        current += 1
        t
      } else 0
    }
  }


}
