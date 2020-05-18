package assignment1

object Q3 {
    def main(args: Array[String]) {
    var value=PriceOfBook(60)-discount(60)+shippingCost(60)
      println("Total wholesale for 60 copies = Rs. "+value)
  }
    def PriceOfBook(n:Int):Double={
      return n*24.95
    }
    def discount(n:Double):Double={
      var amount=n*24.95*40/100
      return amount
    }
    def shippingCost(n:Int):Double={
      return n*3+ (n-50)*0.75
    }
}