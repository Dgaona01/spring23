fun main() {
  
    print("Enter the object's mass in kilograms: ")
    val mass = readLine()?.toDoubleOrNull()

    if (mass != null) {
        val weight = mass * 9.8
        println("The object weighs $weight Newtons")

        if (weight > 1000) {
            println("The object is too heavy.")
        } else if (weight < 10) {
            println("The object is too light.")
        }
    } else {
        println("Error: Invalid input. Please enter a valid number for the object's mass.")
    }
}
