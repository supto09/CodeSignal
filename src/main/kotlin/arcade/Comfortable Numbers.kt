package arcade

fun comfortableNumbers(l: Int, r: Int): Int {
    var total_pairs = 0
    for( i in l..r){
        for(j in i+1 .. r){
            val s_a = getSumOfDigit(i)
            val s_b = getSumOfDigit(j)
            if (j>=(i-s_a) && j<=(i+s_a) && i>=(j-s_b) && i<=(j+s_b)) {
                total_pairs++
            }
        }
    }
    return total_pairs
}

fun getSumOfDigit(n:Int):Int{
    var number = n
    var sum = 0
    while(number>0){
        sum += (number % 10)
        number = number / 10
    }

    return sum
}
