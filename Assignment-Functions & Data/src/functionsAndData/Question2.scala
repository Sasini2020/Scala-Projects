package functionsAndData

object Question2 extends App{
  var r1=new rationalNum(3,4)
  var r2=new rationalNum(5,8)
  var r3=new rationalNum(3,7)

  var r4=r1-r2-r3;

  println("x = "+ r1)
  println("y = "+r2)
  println("z = "+r3)
	println("x-y-z = "+r4)
 
}

class rationalNum(n:Int,d:Int){
	require(d>0,"d must be greater than zero")
	
    def numer=n/gcd(n,d)
    def denom=d/gcd(n,d)
    def this(n:Int)=this(n,1)
    private def gcd(a:Int,b:Int):Int = if(b==0) a else gcd(b,a%b)
    def +(r:rationalNum)=new rationalNum(this.numer*r.denom + this.denom*r.numer,this.denom*r.denom)
    def neg=new rationalNum(-this.numer,this.denom)
    def -(r:rationalNum)=this+r.neg
    override def toString= numer+"/"+denom
}
