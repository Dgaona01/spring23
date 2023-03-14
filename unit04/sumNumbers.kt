import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a positive nonzero integer: ")
    val num = scanner.nextInt()

    var sum = 0
    for (i in 1..num) {
        sum += i
    }

    println("The sum of integers from 1 to $num is $sum.")
}
