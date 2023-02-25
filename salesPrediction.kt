fun main() {
    val percent = .62
    val salesTotal = 4600000
    val salesPercent = salesTotal * percent
    val format: NumberFormat = NumberFormat.getcurrencyInstance()
    println(format.format(salesPercent))
}
