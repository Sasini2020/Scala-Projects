package caecercipher

object CaecerCipher extends App{
 
val Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

val message="CaecerCipher"

/*print("Enter your secret message :")
var message=scala.io.StdIn.readLine()*/

//Remodify this as it can be held time or a date

val Encryption=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

val Decryption=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)

val CaeserCipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

val text1=CaeserCipher(Encryption,message,1,Alphabet)
val text2=CaeserCipher(Decryption,text1,1,Alphabet)

println("Your message: "+message)
println("Encrypted message: "+text1)
println("Decrypted message: "+text2)

}
