package interview


//You have an array of integers nums and an array queries, where queries[i] is a pair of indices (0-based). Find the sum of the elements in nums from the indices at queries[i][0] to queries[i][1] (inclusive) for each query, then add all of the sums for all the queries together. Return that number modulo 109 + 7.

fun sumInRange(nums: MutableList<Int>, queries: MutableList<MutableList<Int>>): Int {
    if (nums.size == 0 || queries.size == 0) return 0
    val mod = 1000000007
    val map = HashMap<Int, Int>()
    var sumPre = nums[0]
    map[0] = sumPre
    for (i in 1 until nums.size) {
        sumPre += nums[i]
        map[i] = sumPre % mod
    }
    var sum = 0
    for (i in queries.indices) {
        if (queries[i][0] == 0)
            sum = sum % mod + map[queries[i][1]]!! % mod
        else
            sum = sum % mod + map[queries[i][1]]!! - map[queries[i][0] - 1]!! % mod
    }
    return (sum + mod) % mod
}
