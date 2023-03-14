import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a string: ")
    val str = scanner.nextLine()

    print("Enter a character: ")
    val char = scanner.next()[0]

    val count = str.count { it == char }

    println("The character '$char' appears in the string '$str' $count times.")
}
