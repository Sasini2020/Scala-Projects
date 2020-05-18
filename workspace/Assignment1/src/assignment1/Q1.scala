package assignment1

object Q1 {
   def main(args: Array[String]): Unit = {
    var temp=ConvertToF(35)
    println("Temperature in 'F = "+temp)
  }
   def ConvertToF(t:Double):Double={
     return t*1.800+32.00
     
   }
}
