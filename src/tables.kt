fun main(){
    println("-------Tables-------")

    while (true) {
        print("Enter Number of the Table =")
        val num=readln().toIntOrNull()
        if(num==null || num<=0){
            println("Enter An valid NUmber")
            continue
        }
        print("Enter Length OF the Table =")
        val len=readln().toIntOrNull()
        if(len==null ||len<=0){
            println("Enter a Valid Length")
            continue
        }
        for(i in 1..len){
            var res=i*num
            println("$i * $num =$res")
            Thread.sleep(300)
        }
        println("To continue with Another Table yes/no")
        val choice=readln().toString()
        if(choice=="no"){
            Thread.sleep(200)
            println("Thanks For Using And Exiting The Program")
            break
        }
    }
}