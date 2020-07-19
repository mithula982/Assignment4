object Ceaser{
def main(args:Array[String]):Unit=
{
val alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val key=1;
println("Shift value: "+key);
val s=scala.io.StdIn.readLine("Enter the string:")

val E= (c:Char,key:Int,st:String)=>st((st.indexOf(c.toUpper)+key)%st.size)



val cipher=(algo:(Char,Int,String)=>Char,s:String, key:Int,st:String)=>s.map(algo(_,key,st))
val Enc=cipher(E,s,key,alphabet)

val D=(c:Char,key:Int,st:String)=>st((st.indexOf(c.toUpper)-key)%st.size)

val Dec=cipher(D,Enc,key,alphabet)

println("Encrypted Mesg: "+Enc);
println("Decrypted Mesg: "+Enc);
}
}