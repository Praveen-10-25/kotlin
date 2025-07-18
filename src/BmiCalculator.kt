class BmiCalculator(val wieght:Double, val height: Double ,val name: String){

    fun BMI() {
        val bmi = wieght / (height * height)
        println("\n---------BMI Report for $name------------")
        println("Your BMI is : %.2f".format(bmi))
        println("Category: ${getCategory(bmi)}")
    }

    private fun getCategory(bmi: Double): String{
        return when{
            bmi<18.5->"UnderWeight"
            bmi<24.9->"Normal Weight"
            bmi<29.9->"Over Wight"
            else->"Obese"
        }
    }
}

fun main(){
    println("------------Calculate Your BMI------------")
    var weight:Double
    var height:Double
    var name: String

    while(true){
        println("Enter Your Name =")
        name=readln()
        if(name.isBlank()){
            print("You can't Leave It Blank")
            continue
        }
        print("Press 1 To Enter Your Weight In KILOGRAMS \n Press 2 Enter Your Weight In Pounds ")
        var Choice=readln().toIntOrNull()
        if(Choice==null|| (Choice!=1 && Choice!=2)){
            println("Hey $name Enter the Valid Choice")
            continue
        }
           weight = when(Choice) {
               1 -> {
                   println("Enter Your Weight In Kilogram =")
                   val input = readln().toDoubleOrNull()
                   if (input == null || input <= 0) {
                       println("Invalid Weight... Please try again.")
                       continue
                   }
                   input
               }

               2 -> {
                   println("Enter Your Weight In Pounds =")
                   val pounds = readln().toDoubleOrNull()
                   if (pounds == null || pounds <= 0) {
                       println("You Didn't Entered A Number.... ")
                       continue
                   }
                   pounds * 0.453592
               }

               else -> continue
           }

            print("Press 1 To Enter Your Height In CentiMeter \n Press 2 Enter Your Height In Foot ")
            var Hchoice=readln().toIntOrNull()
            if(Hchoice==null || (Hchoice!=1 && Hchoice!=2)){
                println("hey $name Didn't Entered A Number .........")
                continue
            }
             height=when(Hchoice){
                    1->{
                        print("Enter Your Height In Centimeter =")
                        var cm=readln().toDoubleOrNull()
                        if(cm==null || cm<0.0){
                            println("Invalid Height.....")
                            continue
                        }
                        cm/100
                    }
                    2->{
                        print("Enter Your Height In Foot =")
                        var foot=readln().toDoubleOrNull()
                        if(foot==null || foot<0.0){
                            println("Hey $name Enter An Valid Number ........")
                            continue
                        }
                        foot*0.3048
                    }
                 else->continue
                }
        val calc=BmiCalculator(weight,height,name)
        calc.BMI()
        break
            }
        }


