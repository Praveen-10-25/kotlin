fun main(){
    println("enter an number :")
   val num=readln().toIntOrNull()
    if(num!=null){
        if(num%2==0){
            println("Its an even number")
        }
        else{
            println("its an Odd Number")
        }
    }else{
        println("You didn't enter An valid number")
    }
}
