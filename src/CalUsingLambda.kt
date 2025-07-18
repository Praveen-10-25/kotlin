fun main(){

    val add:(Double,Double)->Double={a,b->a+b}
    val sub:(Double,Double)->Double={a,b->a-b}
    val mul:(Double,Double)->Double={a,b->a*b}
    val div: (Double, Double)->Double={a,b->
        if(b!=0.0)a/b else {
        println("Zero can't be Divided")
            0.0
    }
    }

    println("Enter Number For num1= ")
    var a= readln().toDouble()
    println("Enter Number For num2 =")
    var b=readln().toDouble()
    println("Enter An Operation(+,-,*,/) =")
    var op= readln()

    var result:Double=when(op){
        "+"->add(a, b)
        "-"->sub(a, b)
        "*"->mul(a, b)
        "/"->div(a, b)
        else -> {
            println("Entered Invalid Operator is Entered")
            return
        }
    }
    println("Result =$result ")
}