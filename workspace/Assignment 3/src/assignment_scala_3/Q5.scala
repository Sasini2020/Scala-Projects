package assignment_scala_3
//Ok
object Q5 {
  def main(args: Array[String]): Unit = {
  print("Enter a number : ")
  var num=scala.io.StdIn.readInt()
    println("Sum of all even numbers unitl "+num+" = "+SumOfEven(num))
    // 0+2+4+6=12 Here we don't consider about the negative numbers
  }
  def SumOfEven(n:Int):Int={
    if(n==0) return 0
    else if(n%2==0) n-2+SumOfEven(n-2)
    else return n-1 + SumOfEven(n-1)
  }
}