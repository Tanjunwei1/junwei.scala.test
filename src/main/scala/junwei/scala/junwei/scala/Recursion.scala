package junwei.scala.junwei.scala

object Recursion {
  def main(args: Array[String]): Unit = {
    def rec(n: Int){
      if(n>2){
        rec(n-1)
        println("INNER"+n)
      }
      println("n="+n)
    }
    rec(4)
    def f1(n:Int,args : String*) = {
      var sum = ""
      for(i <- args) sum = sum+i

      println("this is vaue"+n+"    this is seq[String]:"+sum)
    }
    f1(3,"asdada","asdada","78787klklwer","dasdadff3")
  }
}
