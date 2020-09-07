package arcade

fun constructSquare(s: String): Int {
    val max = getMaxPossibleSqrNum(s.length)
    val min = getLeastPossibleSqrNum(s.length)
    return (max downTo min).map { it * it }.firstOrNull { isStringMatchNum(s, it) }?:-1

}
fun isStringMatchNum(s: String, n: Int) :Boolean{
    val strMap = s.groupingBy { it }.eachCount()
    val numMap = n.toString().groupingBy { it }.eachCount()
    if(strMap.size == numMap.size){
        return strMap.values.sorted().zip(numMap.values.sorted()).all { it.first == it.second }
    }
    return false
}
fun getMaxPossibleSqrNum(numDigits: Int): Int {
    val num = "9".repeat(numDigits).toDouble()
    val sqr = Math.sqrt(num)
    return Math.floor(sqr).toInt()
}

fun getLeastPossibleSqrNum(numDigits: Int): Int {
    val sqr = Math.sqrt(Math.pow(10.0, numDigits.toDouble() - 1.0))
    return Math.ceil(sqr).toInt()
}
