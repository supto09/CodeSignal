package arcade

fun candles(candlesNumber: Int, makeNew: Int): Int {
    var candles = candlesNumber
    var leftOver = candles

    while(leftOver >= makeNew){
        val newCanlde = leftOver / makeNew
        val newLeftOver = leftOver % makeNew

        candles = candles + newCanlde
        leftOver = newLeftOver + newCanlde
    }


    return candles
}
