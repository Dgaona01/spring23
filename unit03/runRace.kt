  fun main () {

    print("Enter the name of the first runner: ")
    val name1 = readLine()
    
    print("Enter the time (in minutes) for $name1 to finish the race: ")
    val time1 = readLine()?.toDoubleOrNull()

    print("Enter the name of the second runner: ")
    val name2 = readLine()
    
    print("Enter the time (in minutes) for $name2 to finish the race: ")
    val time2 = readLine()?.toDoubleOrNull()

    print("Enter the name of the third runner: ")
    val name3 = readLine()
    
    print("Enter the time (in minutes) for $name3 to finish the race: ")
    val time3 = readLine()?.toDoubleOrNull()
    
    val runners = arrayOf(
        name1 to time1,
        name2 to time2,
        name3 to time3
    )

    println("The runners finished in the following order:")
    runners.sortBy { it.second }
    runners.forEach { println(it.first) }
    }





