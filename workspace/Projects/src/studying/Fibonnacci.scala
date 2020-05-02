package studying

object Fibonnacci {
   def main(args: Array[String]): Unit = {
     
   println(fibonacci(10)) 
    
  }
   
   def fibonacci(n:Int):Int={
     if(n==0)
       return 0
       
      if(n==1)
       return 1
       
     else
       return fibonacci(n-1)+fibonacci(n-2)
      
   }
}
