package interview

fun arrayMaxConsecutiveSum2(inputArray: MutableList<Int>): Int {

    var maxSum = inputArray[0]
    var lastSubArraySum = maxSum

    for(index in 1 until inputArray.size){
        if(inputArray[index] > (lastSubArraySum + inputArray[index])){
            lastSubArraySum = inputArray[index]
        } else {
            lastSubArraySum = lastSubArraySum + inputArray[index]
        }

        maxSum = Math.max(maxSum,lastSubArraySum)
    }

    return maxSum
}
