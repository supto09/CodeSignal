package arcade


//Given a positive integer number and a certain length, we need to modify the given number to have a specified length. We are allowed to do that either by cutting out leading digits (if the number needs to be shortened) or by adding 0s in front of the original number.
fun integerToStringOfFixedWidth(number: Int, width: Int): String {
    val resultString = "$number"
    if(resultString.length < width){
        return resultString.padStart(width,'0')
    }
    return resultString.takeLast(width)
}
