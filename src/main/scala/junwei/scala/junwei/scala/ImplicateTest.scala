package junwei.scala.junwei.scala

  /**
   * Created by zhen on 2019/1/12.
   */
  /**
   * 定义隐式参数
   * 单个
   */
  object ImplicitContext{
    implicit val sex : String = "man" //名称不影响下面使用，可以是不同的名称
  }
  /**
   * 定义隐式参数
   * 多个
   */
  object ImplicitContextMutil{
    implicit val sex : String = "woman" //名称不影响下面使用，可以是不同的名称
    implicit val he : String = "he"
  }
  object ImplicitParam {
    //定义使用隐式参数的函数
    def useImplicitMethod(name : String)(implicit sex : String){ // 柯里化
      println(name + " has eighteen years old,he is a good "+ sex)
    }
    def main(args: Array[String]) {
      useImplicitMethod("L.L")("girl")
      // 导入隐式参数
      import ImplicitContext._ // 导入全部，只能存在一个隐式参数
      useImplicitMethod("J.J")
      /**
       * 当存在多个隐式参数时，要想使第二次导入的生效必须定义成相同的名称。
       */
      //import ImplicitContextMutil.he // 失效
      import ImplicitContextMutil.sex // 导入指定的一个隐式参数，避免出现歧义
      useImplicitMethod("J.K")
    }

}
