import scala.io.StdIn.readInt

object PatternMatch {
  def checkNUM(num: Int): Unit = num match {
    case 1 if num < 0 || num == 0 => println("Negative or Zero is given")
    case 2 if num % 2 == 0 => println("Even number is given")
    case _ if num % 2 != 0 => println("Odd number is given")
  }


  def main(args:Array[String]) : Unit ={
    print("Input Number - ")
    val n = readInt()
    checkNUM(n)
  }

}
