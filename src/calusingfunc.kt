fun add(a:Double,b:Double):Double{
    return a+b
}
fun sub(a:Double,b:Double):Double{
    return a-b
}
fun mul(a:Double,b:Double):Double{
    return a*b
}
fun div(a:Double,b:Double):Double{
    return if(b!=0.0)
        a/b else{
        println("Zero can't be Divided ")
        0.0
        }
}

fun main(){
    print("Enter Number For Num1 =")
    var num1= readln().toDouble()
    println("Enter Number For Num2 =")
    var num2= readln().toDouble()
    print("Enter an operation You Want To done =")
    val op= readln().toString()

    val result= when (op){
        "+"->add(num1,num2)
        "-"->sub(num1,num2)
        "*"->mul(num1,num2)
        "/"->div(num1,num2)
        else -> {
            println("Your Entered an Invalid Operation ")
        }
    }
    println("Result= $result")
}