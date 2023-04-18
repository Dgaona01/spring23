fun main() {
    val wholesaleCost = readLine()!!.toDouble()
    val markupPercentage = readLine()!!.toDouble()

    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)

    println("The item's retail price is $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupAmount = wholesaleCost * markupPercentage / 100
    val retailPrice = wholesaleCost + markupAmount
    return retailPrice
}
