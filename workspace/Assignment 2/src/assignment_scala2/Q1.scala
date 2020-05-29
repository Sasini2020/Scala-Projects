package assignment_scala2

object Q1 {
   def main(args: Array[String]): Unit = {
    println("Enter number of working hours : ");
    var Whours=scala.io.StdIn.readInt()
    println("Enter number of OT hours : ");
    var OThours=scala.io.StdIn.readInt()
    
    var salary=takeHomeSalary(Whours, OThours)
    println("Take home salary of an employee : Rs."+salary)
   
  }
   def fee(hours:Int):Int=hours*150
   def OTcharge(hours:Int):Int=hours*75
   def income(hours1:Int,hours2:Int):Int=fee(hours1)+OTcharge(hours2)
   def tax(income:Int):Double=income*10/100
   def takeHomeSalary(hours1:Int,hours2:Int):Double=income(hours1,hours2)-tax(income(hours1,hours2))
   
}