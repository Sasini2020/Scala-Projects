package assignment_scala_3
//ok
object Q3 {
def main(args: Array[String]): Unit ={
print("Enter a number : ")
var n=scala.io.StdIn.readInt() 
def calc(n:Int):Int={
 if(n==0) return 0
 else return n+calc(n-1)
 
  }
  println("The addition of 1 to "+n+" = "+calc(5))
 }
   
}