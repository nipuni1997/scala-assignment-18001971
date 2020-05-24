import java.io._

object cost {
  def main(args: Array[String]): Unit = {
    var cost=.0
    var price=.0
    var discount=.0
    discount =0.4
    price = 24.95
    cost=(price*60+3+10*0.75)-price*60*discount
    println("Cost:" + cost)

  }
}
