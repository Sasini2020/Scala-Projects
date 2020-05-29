package assignment_scala_3
//Ok
object Q4 {
  def main(args: Array[String]): Unit = {  
  print("Enter a number : ")
  var num=scala.io.StdIn.readInt()
  printf(IsEvenOdd(num))
  }
   def IsEvenOdd(n:Int):String={
     if(n==0) return "Number is Even"
     else if(n==1) return "Number is Odd"
     else return IsEvenOdd(n-2)
   }
   
}