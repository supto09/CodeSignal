package interview

fun rotateImage(a: MutableList<MutableList<Int>>): MutableList<MutableList<Int>> {
    val resultArray = mutableListOf<MutableList<Int>>()
    for(row in 0 until a.size){
        val newRowList = mutableListOf<Int>()
        for(column in (a.size-1) downTo 0){
            newRowList.add(a[column][row])
        }
        resultArray.add(newRowList)
    }

    return resultArray
}
