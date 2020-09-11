package arcade

//N candles are placed in a row, some of them are initially lit. For each candle from the 1st to the Nth the following algorithm is applied: if the observed candle is lit then states of this candle and all candles before it are changed to the opposite. Which candles will remain lit after applying the algorithm to all candles in the order they are placed in the line?

fun switchLights(a: MutableList<Int>): MutableList<Int> {

    for (i in a.indices) {

        if (a[i] == 1) {
            for (j in 0 .. i) {
                a[j] = if (a[j] == 0) 1 else 0

            }
        }
    }
    return a
}
