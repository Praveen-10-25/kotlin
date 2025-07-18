fun main(){
    println("enter your name")
    val name= readln().toString()
    println("enter your age")
    val age= readln().toIntOrNull()
    if(age!=null){
        if(age>=18){
            println("hey $name Grab your ID...")
        }else{
            println("hey kid You Need to grow")
        }
    }else{
        println("hey $name Enter your Age Correctly")
    }
}