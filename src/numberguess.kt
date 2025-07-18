fun main() {
    val res = (0..9).random()
    println("WELCOME TO GUESSING GAME")

    var attempt = 0;
    while (true) {
        println("guess any number from 1 to 10 :")
        var guess = readln().toIntOrNull()

        if (guess == null) {
            print("Enter an Valid Number")
            continue
        }
        attempt++
        when {
            guess < res -> println("its Lower than Actual Number")
            guess > res -> println("its higher than Actual Number")
            else -> {
                println("congrats you won Finally in ATTEMPT $attempt")
                break
            }
        }
    }
}
