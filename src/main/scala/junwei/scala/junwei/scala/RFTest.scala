package junwei.scala.junwei.scala

object RFTest {
  def main(args: Array[String]): Unit = {
    def urlBuilder(ssl: Boolean, domainName: String): (String, String) => String = {
      val schema = if (ssl) "https://" else "http://"
      (endpoint: String, query: String) => s"$schema$domainName/$endpoint?$query"
    }
    def urla(ss:Boolean,domainName:String) = {

      (end:String,start:String)=>s"$end hahaaha $start"
    }

    val c = urla(false,"AAA")
    val res = c("this is end","this is start")
    println(res)

    println("~~~~~~~~~~~~~~~~~~~~~~~~")

    val domainName = "www.example.com"
    def getURL = urlBuilder(ssl=true, domainName)
    val endpoint = "users"
    val query = "id=1"
    val url = getURL(endpoint, query)
    println(url)
  }
}
