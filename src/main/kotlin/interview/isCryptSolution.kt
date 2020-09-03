package interview

fun isCryptSolution(crypt: MutableList<String>, solution: MutableList<MutableList<Char>>): Boolean {

    val solutionMap = mutableMapOf<Char,Int>()
    solution.map{
        solutionMap[it[0]] = Character.getNumericValue(it[1])
    }

    println(solutionMap)

    crypt.forEach{
        if(it.length>1 && solutionMap[it[0]]==0)
            return false
    }



    val leftHand = getNumber(crypt[0],solutionMap)+getNumber(crypt[1],solutionMap)
    val rightHand = getNumber(crypt[2],solutionMap)


    return leftHand == rightHand
}

fun getNumber(word:String,values:Map<Char,Int>):Int{
    var sum =0

    word.forEach{
        val number = values[it] ?:0
        sum = sum*10 + number
    }

    return sum

}