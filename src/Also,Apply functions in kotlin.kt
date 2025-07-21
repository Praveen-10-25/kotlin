import kotlin.math.sin

fun main() {
    val fruits=mutableListOf<String>("Apple","Orange","Banana")

    fruits.let{
        println("let-> Original List->$it")
    }

    val count=fruits.run{
        println("run->Adding mango")
        add("mango")
        size
    }
    println("run->Total Fruits->$count")

    val updatedlist=fruits.apply {
        add("Cherry")
        remove("Banana")
    }
    println("Apply -> updated List->$updatedlist")

    with(fruits){
        println("first fruit->${first()}")
        println("Last fruit->${last()}")
    }

    fruits.also {
        println("also->About to Clear The list....")
    }.clear()

    print("Final list: $fruits")
}