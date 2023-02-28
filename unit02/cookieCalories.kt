fun main() {
    println("How many cookies did you eat?")
    val numCookies = readLine()!!.toInt()

    val calorieCount = (numCookies * 300) / 10
    println("You consumed a total of $calorieCount calories.")
}
