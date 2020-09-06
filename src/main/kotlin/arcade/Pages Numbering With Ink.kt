package arcade

fun pagesNumberingWithInk(current: Int, numberOfDigits: Int): Int {
    var lastPrintedPage = current

    var number = current
    var remainingDigit = numberOfDigits

    while(true){
        val digit = getDigitCount(number)
        if(digit > remainingDigit){
            return lastPrintedPage
        }

        remainingDigit = remainingDigit - digit
        lastPrintedPage = number
        number++
    }

    return 0
}


fun getDigitCount(n:Int):Int{
    var count = 0
    var number = n
    while(number>0){
        number = number / 10
        count++
    }
    return count
}
