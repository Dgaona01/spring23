
fun main() {
    println("Enter the name of your favorite city:")
    val cityName = readLine()!!
    val cityNameLength = cityName.length
    val cityNameUpperCase = cityName.toUpperCase()
    val cityNameLowerCase = cityName.toLowerCase()
    val firstCharacter = cityName[0]

    println("The length of the city name is: $cityNameLength")
    println("The name of the city in uppercase is: $cityNameUpperCase")
    println("The name of the city in lowercase is: $cityNameLowerCase")
    println("The first character of the city name is: $firstCharacter")
}
