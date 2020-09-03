package interview

fun firstDuplicate(a: MutableList<Int>): Int {
    val firstOccuranceMap = mutableMapOf<Int,Int>()

    a.forEachIndexed{ index,number->
        val existingValue = firstOccuranceMap[number]?:0
        if(existingValue==1)
            return number

        val newValue = existingValue+1
        firstOccuranceMap[number] = newValue
    }




    return -1
}
