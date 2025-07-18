fun main(){
    println("enter an number =")
    var num=readln()
    var sum=0
   for(ch in num){
       var digit=ch.toString().toIntOrNull()
       if(digit!=null){
           sum+=digit
       }
   }
    println("The Sum of the digits are $num=$sum")
}