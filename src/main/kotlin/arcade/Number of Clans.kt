package arcade

//Let's call two integers A and B friends if each integer from the array divisors is either a divisor of both A and B or neither A nor B. If two integers are friends, they are said to be in the same clan. How many clans are the integers from 1 to k, inclusive, broken into?

fun numberOfClans(divisors: MutableList<Int>, k: Int): Int {
    var curSum: Int = 0
    val clans = mutableListOf<Int>()
    for(i in 1..k) {
        for(j in 0 until divisors.size) {
            if(i % divisors[j] == 0) {
                curSum += Math.pow(10.0, j.toDouble()).toInt()
            }
        }
        clans.add(curSum)
        curSum = 0
    }
    return clans.distinct().size
}
