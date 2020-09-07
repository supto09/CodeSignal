package arcade

fun differentSquares(matrix: MutableList<MutableList<Int>>): Int {
    val setOfMatrix = mutableSetOf<List<Int>>()

    for( row in 0 until (matrix.size - 1)){
        for(column in 0 until (matrix[0].size-1)){
            val matrix = listOf(
                matrix[row][column],
                matrix[row + 1][column + 1],
                matrix[row + 1][column],
                matrix[row][column + 1]
            )
            setOfMatrix.add(matrix)
        }
    }
    return setOfMatrix.size
}
