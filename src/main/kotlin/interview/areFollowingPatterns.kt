package interview

fun areFollowingPatterns(strings: MutableList<String>, patterns: MutableList<String>): Boolean {
    if(strings.size != patterns.size) return false

    val patternInputMap = mutableMapOf<String,String>()
    val inputPatternMap = mutableMapOf<String,String>()

    for(index in strings.indices){

        val input = strings[index]
        val pattern = patterns[index]

        val exitingValueForPattern:String? = patternInputMap[pattern]
        if(exitingValueForPattern == null){
            patternInputMap[pattern] = input
        } else {
            if(exitingValueForPattern != input){
                return false
            }
        }


        val existingValueForInput:String? = inputPatternMap[input]
        if(existingValueForInput == null){
            inputPatternMap[input] = pattern
        } else{
            if(existingValueForInput != pattern){
                return false
            }
        }

    }

    return true
}

