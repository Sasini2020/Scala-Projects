package functionsAndData

object Question1 extends App{
  var r1=new Rational(2,5)
  var r2=new Rational(-11,25)  
  var r3=new Rational(3)
  
  println("r1 = "+ r1)
  println("r1.neg = "+r1.neg)
  println("r2 = "+r2)
  println("r2.neg = "+r2.neg)
  println("r3 = "+r3)
  println("r3.neg = "+r3.neg)
}


class Rational(n:Int,d:Int){
  require(d>0,"Do not give denominator as 0 ")
  
  def numer=n
  def denom=d
  
  //Using below part you can also insert one parameter
  def this(n:Int)=this(n,1)
  
  def neg=new Rational(this.numer*(-1),this.denom)
  override def toString()=numer+"/"+denom

}