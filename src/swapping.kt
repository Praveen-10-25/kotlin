fun main(){
    print("Enter an 1st  Number =")
    var a= readln().toIntOrNull()
    print("Enter an2nd Number =")
    var b= readln().toIntOrNull()
    println("Before Swapping a=$a and b=$b " )

    if(a !=null && b!=null && b>0 && a>0){
        var temp=0
        temp=a
        a=b
        b=temp
    }
    println("After Swapping a=$a and b=$b")
}