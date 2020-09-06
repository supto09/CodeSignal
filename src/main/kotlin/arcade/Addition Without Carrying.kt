package arcade

fun additionWithoutCarrying(param1: Int, param2: Int): Int {
    var numberOne = param1
    var numberTwo = param2

    var sum = 0
    var powerOf = 0

    while(numberOne > 0 || numberTwo > 0  ){
        var lastDigitNumberOne = numberOne % 10
        var lastDigitNumberTwo = numberTwo % 10

        numberOne = numberOne / 10
        numberTwo = numberTwo / 10

        val lastDigitSumWithoutCarry  = (lastDigitNumberOne + lastDigitNumberTwo) % 10

        sum = sum + Math.pow(10.0, powerOf.toDouble()).toInt() * lastDigitSumWithoutCarry

        powerOf++
    }


    return sum
}
