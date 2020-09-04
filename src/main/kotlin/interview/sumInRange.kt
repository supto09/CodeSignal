package interview

fun sumInRange(nums: MutableList<Int>, queries: MutableList<MutableList<Int>>): Int {
    val numberPositionMap = mutableMapOf<Int,Int>()
    for(index in nums.indices){
        val number = nums[index]
        numberPositionMap[index] = number
    }


    var sum = 0
    for(query in queries){
        val firstIndex = query[0]
        val secondIndex = query[1]

        for(index in firstIndex..secondIndex){
            val value =  numberPositionMap[index]?:0
            sum = sum + value
        }
    }
    return sum
}
