class Bankingfunc(val name:String,val accountNumber: Int) {
    private var balance: Double = 1000.0

    fun deposit(amount: Double) {
        if (amount != 0.0) {
            balance += amount
            print("Amount Added Successfully \n New Balance is =$balance")
        } else {
            println("Sorry You Entered an Invalid Amount")
        }
    }

    fun withdraw(amount: Double) {
        if (amount < balance) {
            balance -= amount
            print("The withdraw Amount is $amount \n Current Balance is =$balance")
        } else if (amount > balance) {
            println("Insufficient Balance =$balance")
        } else {
            print("Entered an invalid Amount ")
        }
    }

    fun showdetails() {
        println("----- Account Details -----")
        println("name =$name")
        println("Account Number=$accountNumber")
        println("Current Balance=$balance")
        println("------------------------------")
    }
    }
    fun main() {
        print("Enter Your Name =")
        val name = readln().toString()
        print("Enter Your Account Number=")
        val accountNumber = readln().toIntOrNull()
        if (accountNumber != null) {
            val user = Bankingfunc(name, accountNumber)

            while (true) {
                println("---------Welcome to YONO----------")
                println("(1) press 1 For Deposit")
                println("(2) press 2 For Withdraw")
                println("(3) press 3 For ViewDetails")
                println("(4) press 4 For Exit")

                print("Enter Your choice =")
                var choice = readln().toIntOrNull()
                when (choice) {
                    1 -> {
                        println("enter an Amount to deposit =")
                        val amt = readln().toDouble()
                        user.deposit(amt)
                    }
                    2->{
                        println("enter an Amount to Withdraw =")
                        val amt=readln().toDouble()
                        user.withdraw(amt)
                    }
                    3->{
                        println(user.showdetails())
                    }
                    4->{
                        println("Thank You for Reaching us")
                        break
                    }
                    else->
                        println("You Entered An Invalid choice")
                    }
            }
        }else{
            println("Account NUmber is Invalid")
        }
    }
