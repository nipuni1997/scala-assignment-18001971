import java.io._

object volume {
  def main(args: Array[String]): Unit = {
    var radius = 0
    var volume = .0
    radius=5
    volume= (4*3.14)/3*radius*radius*radius
    println("Volume: " + volume)
  }
}
