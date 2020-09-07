package arcade

fun mostFrequentDigitSum(n: Int): Int {
    val freqCountMap = mutableMapOf<Int,Int>()


    var number = n
    while(number>0){
        val sumOfDigit = sumOfDigit(number)

        val prevCount = freqCountMap[sumOfDigit] ?: 0
        freqCountMap[sumOfDigit] = prevCount + 1

        number = step(number)
    }


    val maxValue = freqCountMap.maxBy{ it.value }?.value ?: 0

    val largestDigitCount =  freqCountMap.filter{
        it.value == maxValue
    }.maxBy{
        it.key
    }?.key ?: 0


    return largestDigitCount
}

fun step(n:Int) : Int = n - sumOfDigit(n)

fun sumOfDigit(n:Int):Int{
    var number = n
    var sum = 0
    while(number>0){
        sum += number % 10
        number = number / 10
    }
    return sum
}





