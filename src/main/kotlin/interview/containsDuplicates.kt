package interview

fun containsDuplicates(a: MutableList<Int>): Boolean {
    val freqMap = mutableMapOf<Int,Int>()

    for(number in a){
        val existingCount = freqMap[number]?:0

        if(existingCount>0){
            return true
        }
        freqMap[number] = existingCount+1
    }

    return false
}