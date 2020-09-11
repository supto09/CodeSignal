package arcade

//You are given an array of integers that you want distribute between several groups. The first group should contain numbers from 1 to 104, the second should contain those from 104 + 1 to 2 * 104, ..., the 100th one should contain numbers from 99 * 104 + 1 to 106 and so on.

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
