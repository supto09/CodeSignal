package arcade

fun numbersGrouping(a: MutableList<Int>): Int {
    val groupCountMap = mutableMapOf<Int,Int>()

    for(number in a){
        val groupNo = if(number % 10000 == 0){
            number / 10000
        } else{
            (number / 10000) + 1
        }

        val oldCount = groupCountMap[groupNo] ?: 0
        groupCountMap[groupNo] = oldCount + 1
    }

    var lineCount = 0
    groupCountMap.map{
        lineCount = lineCount + 1 + it.value
    }
    return lineCount
}
