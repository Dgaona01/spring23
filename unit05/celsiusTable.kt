fun celsius(f: Double): Double {
  
    // changing farenheit to celsius 
    val c = (5.0 / 9.0) * (f - 32.0)
    
    return c
}

fun main() {
    println("Fahrenheit        Celsius")
    println("----------------------------")

    // looping through Fahrenheit temperatures from 0 to 20
    for (f in 0..20) {
      
        // converting Fahrenheit to Celsius using the celsius function
        val c = celsius(f.toDouble())

        // Display the Fahrenheit and Celsius temps 
        println("$f           $c")
    }
}
