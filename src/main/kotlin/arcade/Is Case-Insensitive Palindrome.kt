package arcade

fun isCaseInsensitivePalindrome(inputString: String): Boolean {
    for(index in 0 until inputString.length/2){
        if(inputString[index].equals(inputString[inputString.length - index - 1],true) == false)
            return false
    }

    return true
}
