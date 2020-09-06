package arcade

fun isSumOfConsecutive2(n: Int): Int {
    var result = 0
    for(startingNumber in 1 until n){
        var sum = 0
        for(number in startingNumber until n){
            sum += number

            if(sum == n){
                // println("startingNumber $startingNumber   number $number")
                result++
            }


            if(sum > n){
                break;
            }
        }
    }

    return result
}
