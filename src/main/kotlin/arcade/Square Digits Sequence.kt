package arcade

fun squareDigitsSequence(a0: Int): Int {
    val sequenceSumtList = mutableListOf<Int>()

    sequenceSumtList.add(a0)
    while(true){
        val lastSum = sequenceSumtList.last()
        val newResult = getDigits(lastSum).fold(0) { sum, element ->
            sum + (element *  element)
        }

        if(sequenceSumtList.contains(newResult)){
            return sequenceSumtList.size + 1
        }

        sequenceSumtList.add(newResult)
    }

    return 0
}

fun getDigits(n:Int):MutableList<Int> {
    var number = n
    val result = mutableListOf<Int>()
    while(number > 0){
        result.add(number%10)
        number = number / 10
    }
    return result
}
