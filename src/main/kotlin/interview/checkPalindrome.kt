package interview

fun checkPalindrome(inputString: String): Boolean {
    for(index in 0..(inputString.length/2)){
        if(inputString[index] != inputString[inputString.length-index-1]){
            return false;
        }
    }

    return true
}
