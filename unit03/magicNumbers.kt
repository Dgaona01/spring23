fun main() {
  
    print("Enter a month (in numeric form): ")
    val month = readLine()?.toIntOrNull()
    
    print("Enter a day: ")
    val day = readLine()?.toIntOrNull()
    `
    print("Enter a two-digit year: ")
    val year = readLine()?.toIntOrNull()

    if (month != null && day != null && year != null) {
        if (month * day == year) {
            println("The date is magic!")
        } else {
            println("The date is not magic.")
        }
    } else {
        println("Error: Invalid input. Please enter valid numbers.")
    }
}
