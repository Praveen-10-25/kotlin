
fun main(){
    println("enter your name :")
    val name= readln().toString()

    val Nameregex=Regex("^[a-zA-Z]+\$")
    if(!name.matches(Nameregex)){
        println("Enter an valid Name ")
        return
    }
    println("enter your mark in java :")
    val java= readln().toIntOrNull()
    println("enter your mark in python :")
    val py= readln().toIntOrNull()
    println("enter your mark in js :")
    val js=readln().toIntOrNull()
    if(java !=null && js!=null && py!=null){
        val total=java+js+py
        val avg=total/3
        when(avg){
            in 0..34-> println("$name Need To Study and You Are failed with $avg%")
            in 35..45->println("$name You Passed with $avg% and need More to Improve ")
            in 46..55->println("$name You passed with $avg% on D Grade")
            in 56..65->println("$name You passed with $avg% on C Grade")
            in 66 ..75->println("$name You passed with $avg% on B Grade")
            in 76..85->println("$name you passed with $avg% on A Grade")
            in 86..<100->println("$name you passed with $avg% on S Grade")
            else->println("Invalid Grades Caused By Entered An Invalid Mark")
        }
    }else{
        println("hey $name Enter your Marks Properly To Get The Correct Results")
    }
}