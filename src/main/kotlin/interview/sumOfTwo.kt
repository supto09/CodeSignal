package interview

fun sumOfTwo(a: MutableList<Int>, b: MutableList<Int>, v: Int): Boolean {
    val complementaryNumberMap = mutableMapOf<Int,Int>()

    for(number in a){
        val complementaryNumber = v - number
        complementaryNumberMap[complementaryNumber] = number
    }

    for( number in b){
        if(complementaryNumberMap.containsKey(number)){
            return true
        }
    }

    return false
}
