package arcade

fun isSubstitutionCipher(string1: String, string2: String): Boolean {
    val charMap: MutableMap<Char, Char> = mutableMapOf()
    string1.forEachIndexed { index, c ->
        val cipherChar = charMap[c]
        if (cipherChar == null) {
            if (charMap.values.contains(string2[index]))
                return false
            charMap[c] = string2[index]
        } else {
            if (cipherChar != string2[index])
                return false
        }
    }
    return true
}
