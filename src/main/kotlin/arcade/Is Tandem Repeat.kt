package arcade

fun isTandemRepeat(inputString: String): Boolean {

    if(inputString.length % 2 != 0)
        return false

    val firstPart = inputString.substring(0,inputString.length/2)
    val secondPart =  inputString.substring(inputString.length/2)

    return firstPart.equals(secondPart,false)
}
