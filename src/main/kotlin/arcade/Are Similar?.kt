package arcade

fun areSimilar(a: MutableList<Int>, b: MutableList<Int>): Boolean {
    val diffInB = mutableListOf<Int>()

    for(index in a.indices){
        val numberA = a[index]
        val numberB = b[index]

        if(numberA != numberB){
            diffInB.add(index)
        }
    }


    if(diffInB.size == 0)
        return true
    if(diffInB.size > 2)
        return false

    return (a[diffInB[0]] == b[diffInB[1]]   &&  a[diffInB[1]] == b[diffInB[0]])

}
