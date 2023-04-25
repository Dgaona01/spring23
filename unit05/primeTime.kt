fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    // Use module operator to check if the remainder of number divided by divisor is zero
    return number % divisor == 0
}

// Define a function that checks if number is prime
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    
    // Loop numbers from 2 to the square root of the number
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
      
        // Check if the current number in the loop divides the number evenly using the isNumberDivisible function
   
      if (isNumberDivisible(number, i)) {
            return false
        }
    }
    
    return true
}

// Define the main function to loop and ask the user to input a number until the input is invalid
fun main() {
    while (true) {
      
        print("Enter a positive integer (or a non-numeric value to exit): ")
        val input = readLine()
        
        // break the loop if it's invalid
        val number = try {
            input?.toInt()
        } catch (e: NumberFormatException) {
            break
        }

        // Check if input is null or less than or equal to 0, or call the isPrime function to check if prime
        if (number == null || number <= 0) {
            println("Invalid input!")
        } else {
            val result = if (isPrime(number)) "is prime" else "is not prime"
            println("$number $result.")
        }
    }
}
