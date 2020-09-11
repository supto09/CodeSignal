package arcade

//Check whether the given string is a subsequence of the plaintext alphabet.

fun alphabetSubsequence(s: String): Boolean {
    for(index in 0 until s.length-1){
        if(s[index] >= s[index+1]){
            return false
        }
    }

    return true
}
