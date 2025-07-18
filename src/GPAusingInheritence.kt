open class person(val name:String, val rollno:Int, val percentage: Double){

    fun displayDetails(){
        println("-------Students Details----------")
        println("Student Name =$name")
        println("Roll Number =$rollno")
        println("Percentage =$percentage")
    }
}
class GpaConversion(name: String,rollno: Int,percentage: Double):person(name,rollno,percentage) {
    fun P_conversion() {
        val gpa = percentage / 10
        displayDetails()
        println("The GPA Converted Is =$gpa")
        println("-------------------------------")
    }
}
fun getValidMarks(subject: String): Int {
    while (true) {
        print("Enter the marks in $subject (0-100): ")
        val marks = readln().toIntOrNull()
        if (marks != null && marks in 0..100) {
            return marks
        } else {
            println(" Invalid input! Please enter a number between 0 and 100.")
        }
    }
}

    fun main() {
        print("enter the number Of Students to Calculate The Gpa =")
        val num = readln().toInt()
        if (num != null) {
            for (stu in 1..num) {
                println("Enter your name =")
                val name = readln().toString()
                println("Enter Your RollNumber=")
                val rollno = readln().toInt() ?: continue

                val java = getValidMarks("Java")
                val python = getValidMarks("Python")
                val kotlin = getValidMarks("Kotlin")
                val springBoot = getValidMarks("Spring Boot")

                val total = java + python+kotlin+springBoot
                val percentage = ((total / 400.0) * 100).toDouble()

                val student = GpaConversion(name, rollno, percentage)
                student.P_conversion()
            }
        } else {
            println("Entered an Invalid Number =$num")
        }
    }