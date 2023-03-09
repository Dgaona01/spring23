fun main() {
  
    print("Enter your weight in pounds: ")
    val weight = readLine()?.toDoubleOrNull()
    
    print("Enter your height in inches: ")
    val height = readLine()?.toDoubleOrNull()

    if (weight != null && height != null) {
        val bmi = weight * 703 / (height * height)
        println("Your BMI is $bmi")

        if (bmi < 18.5) {
            println("You are underweight.")
        } else if (bmi <= 25) {
            println("You have optimal weight.")
        } else {
            println("You are overweight.")
        }
    } else {
      
        println("Error: Invalid input. Please enter valid numbers.")
    }
}
