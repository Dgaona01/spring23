fun main() {
  
    print("Enter a number between 1 and 10: ")
    val num = readLine()?.toIntOrNull()
    if (num != null && num in 1..10) {
        val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
        
        println("The Roman numeral equivalent of $num is ${romanNumerals[num]}")
    } else {
        println("Error: Please enter a number between 1 and 10")
    }
}
