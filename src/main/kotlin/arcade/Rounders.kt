package arcade

fun rounders(n: Int): Int {
    var number = n

    var divider = 1
    while(number > 10){
        val lastDigit = number % 10
        number = number / 10
        if(lastDigit >= 5){
            number ++
        }

        divider = divider * 10
    }

    return number * divider
}