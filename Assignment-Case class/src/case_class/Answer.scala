package case_class

import math.{sqrt,pow}

object Answer extends App{
  
  val p1=Point(5,7)
  val p2=Point(2,3)
  val p3=p1.move(4, 10)
  
  println("p1 = "+p1)
  println("p2 = "+p2)
  println("p3 = "+p3)
  println("p1 + p2 = "+ (p1+p2))
  println("Distance between p1 and p2 = "+p1.distance(p2))
  println("Invert of p1 = " + p1.invert())

}

case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  //1.add(+) to add two points
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  //2.move
  def +(other:Point)=Point(this.x+other.x,this.y+other.y)
  
  //3.distance gives the distance between two points
  def distance(other:Point):Double=sqrt(pow(x-other.x,2) +pow(y-other.y,2))
  
  //4.invert
  def invert()=Point(this.y,this.x)
  


}