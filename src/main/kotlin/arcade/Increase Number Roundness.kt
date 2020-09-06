package arcade

fun increaseNumberRoundness(n: Int): Boolean {
    var number = n
    var trailingZeroFlag = true

    while(number > 0){

        val lastDigit = number % 10
        if(lastDigit != 0){
            trailingZeroFlag = false
        }

        if(lastDigit == 0 && trailingZeroFlag == false){
            return true
        }

        number = number / 10
    }


    return false
}
