package assignment_scala_3
//Ok
object Q6 {
def main(args: Array[String]): Unit = {
  //fibonacciSequence(10)
  print("Enter a number : ")
  var num=scala.io.StdIn.readInt()

  println("Fibonacci Sequence for "+num)
  println("------------------------------")
  fibonacciSequence(num)
  }
def fibonacci(n:Int):Int={
     if(n==0) return 0 
     if(n==1) return 1
     else return fibonacci(n-1)+fibonacci(n-2)
      
   }
def fibonacciSequence(n:Int){
  if(n>0)
    fibonacciSequence(n-1)
  
    println( fibonacci(n))
}
}