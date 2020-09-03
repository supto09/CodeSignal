package interview

fun firstNotRepeatingCharacter(s: String): Char {
    val frequencyMap = mutableMapOf<Char,Int>()

    for (character in s) {
        var count = frequencyMap[character]?:0
        count++
        frequencyMap[character] = count
    }
    println("frequencyMap $frequencyMap")

    val characterSet = s.toSet()
    println("characterSet $characterSet")

    characterSet.forEach{ character->
        val characterCount = frequencyMap[character]
        if(characterCount == 1)
            return character
    }

    return '_'
}
