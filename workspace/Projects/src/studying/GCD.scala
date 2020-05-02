package studying

object GCD {
  
   def main(args: Array[String]): Unit = {
     
    println( gcd(1000,100))
       
  }
   
   def gcd(a:Int,b:Int):Int=
     b match{  
       case 0        => a
       case x if x>a =>gcd(x,a)
       case x        => gcd(x,a%x)
     }
      
}

















