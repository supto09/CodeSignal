package arcade

fun createAnagram(s: String, t: String): Int {

    val charCountMap = mutableMapOf<Char,Int>()
    for(char in s){
        val count = charCountMap[char] ?: 0
        charCountMap[char] = count + 1
    }

    for(char in t){
        val count = charCountMap[char] ?: 0
        charCountMap[char] = count - 1
    }

    val diffSum = charCountMap.map{
        Math.abs(it.value)
    }
        .fold(0){acc, element ->
            acc+element
        }

    return diffSum/2
}
