package interview

//Given an array of integers nums and an integer k, determine whether there are two distinct indices i and j in the array where nums[i] = nums[j] and the absolute difference between i and j is less than or equal to k.


fun containsCloseNums(nums: MutableList<Int>, k: Int): Boolean {
    val indexMapOfValues = mutableMapOf<Int,MutableList<Int>>()

    for((index,number) in nums.withIndex()){
        val existingIndexList = indexMapOfValues[number] ?: mutableListOf<Int>()
        existingIndexList.add(index)
        indexMapOfValues[number] = existingIndexList
    }

    for((key,value) in indexMapOfValues){
        if(value.size >= 2){
            for(index in 0 until value.lastIndex){
                if(Math.abs(value[index]  - value[index+1]) <= k){
                    return true
                }
            }
        }
    }


    return false
}
