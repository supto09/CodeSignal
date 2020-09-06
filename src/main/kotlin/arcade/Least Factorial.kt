package arcade

fun leastFactorial(n: Int): Int {
    var factorial = 1

    var number = 1
    while(true){
        factorial = factorial * number
        number++

        if(factorial >= n){
            return factorial
        }
    }
}
