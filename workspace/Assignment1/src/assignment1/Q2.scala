package assignment1

object Q2 {
   def main(args: Array[String]): Unit = {
    var volume=sphereVol(5)
    println("Volume = "+volume)
    
  }
   def sphereVol(r:Double):Double={
     return (4/3)*math.Pi*r*r*r
     
   }
   
}