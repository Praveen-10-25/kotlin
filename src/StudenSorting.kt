fun main(){
    val students = mutableListOf<Pair<String, Int>>()
    println("Sort The Students")

    while(true) {
        print("Enter the number of Students you want to Sort =")
        val stu = readln().toIntOrNull()
        if(stu==null || stu<=0){
            println(" Invalid Number")
            continue
        }
        for(count in 1.. stu){
            print("Enter the name of the $count student=")
            val name=readln()

            println("Enter The mark for $name =")
            val mark=readln().toIntOrNull()
            if(name!=null && mark !=null){
                students.add(Pair(name,mark))
            }
            else{
                println("Invalid Marks Skipping $mark")
            }
        }
         println("Sorted Students Based on marks")
          students.sortByDescending { it.second }
         for ((name, mark) in students){
             println("$name = $mark")
             Thread.sleep(300)
         }
        break
    }
}                                                   