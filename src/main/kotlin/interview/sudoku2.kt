package interview

fun sudoku2(grid: MutableList<MutableList<Char>>): Boolean {
    for (row in 0 until grid.size) {
        val counter = mutableMapOf<Char, Int>()
        for (column in 0 until grid.size) {
            val currentChar = grid[row][column]
            if (currentChar != '.') {
                val count = counter[currentChar] ?: 0
                if (count > 0)
                    return false
                counter[currentChar] = count + 1
            }
        }
    }

    for (row in 0 until grid.size) {
        val counter = mutableMapOf<Char, Int>()
        for (column in 0 until grid.size) {
            val currentChar = grid[column][row]
            if (currentChar != '.') {
                val count = counter[currentChar] ?: 0
                if (count > 0)
                    return false
                counter[currentChar] = count + 1
            }
        }
    }

    for (row in 0 until grid.size step 3) {
        for (column in 0 until grid.size step 3) {
            val counter = mutableMapOf<Char, Int>()

            for (i in 0..2) {
                for (j in 0..2) {
                    val currentChar = grid[row + i][column + j]
                    print("$currentChar  ")


                    if (currentChar != '.') {
                        val count = counter[currentChar] ?: 0
                        if (count > 0)
                            return false
                        counter[currentChar] = count + 1
                    }
                }
                println()
            }
            println()
        }
        println()
    }

    return true
}