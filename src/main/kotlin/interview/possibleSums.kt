package interview


//You have a collection of coins, and you know the values of the coins and the quantity of each type of coin in it. You want to know how many distinct sums you can make from non-empty groupings of these coins.

fun possibleSums(coins: MutableList<Int>, quantity: MutableList<Int>): Int {
    val coinQuantities = coins.zip(quantity)
    var sums = setOf(0)

    coinQuantities.forEach {
        val possibleAdds = (0..it.second).map { quantity -> it.first * quantity }
        val newSums = mutableSetOf<Int>()
        for (sum in sums) {
            for (possibleAdd in possibleAdds) {
                newSums.add(sum + possibleAdd)
            }
        }
        sums = newSums
    }

    return sums.asSequence().filter { it != 0 }.count()
}
