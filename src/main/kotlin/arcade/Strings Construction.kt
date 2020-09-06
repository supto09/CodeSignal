package arcade

fun stringsConstruction(a: String, b: String): Int {
    val charCountMap = mutableMapOf<Char,Int>()
    for(char in a){
        val count = charCountMap[char] ?: 0
        charCountMap[char] = count + 1
    }

    val secondCharCountMap = mutableMapOf<Char,Int>()
    for(char in b){
        val count = secondCharCountMap[char] ?: 0
        secondCharCountMap[char] = count + 1
    }



    var minCount = Int.MAX_VALUE
    charCountMap.map{
        val countInSecond = secondCharCountMap[it.key] ?: 0
        val possibleWordCount = countInSecond / it.value
        minCount = Math.min(minCount,possibleWordCount)
    }


    return minCount
}
