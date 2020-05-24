import java.io._


object Fahrenhite {
  def main(args: Array[String]): Unit = {
    var Fahrenheit = .0
    var Celsius = .0
    Celsius = 35
    Fahrenheit = Celsius * 1.8 + 35
    println("Temperature in celsius is: " + Fahrenheit)
  }
}