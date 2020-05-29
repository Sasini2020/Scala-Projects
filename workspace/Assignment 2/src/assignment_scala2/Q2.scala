package assignment_scala2

object Q2 {
   def main(args: Array[String]): Unit = {
    println(profit(15),profit(18),profit(20),profit(25),profit(35),profit(43))
  }
   def attendees(Tprice:Int):Int=120+(15-Tprice)/5*20
   
   def revenue(Tprice:Int):Int=attendees(Tprice)*Tprice
   
   def cost(Tprice:Int):Int=attendees(Tprice)+500
   
   def profit(Tprice:Int):Int=revenue(Tprice)-cost(Tprice);
}

/*We can see if ticket price is Rs.25 , then the owner can get a highest profit=Rs.1420.So Rs.25 is the
best ticket price.*/