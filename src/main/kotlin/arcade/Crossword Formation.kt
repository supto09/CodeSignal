package arcade

fun crosswordFormation(words: MutableList<String>): Int {
    var result = 0
    val permutations = permute(words)
    println(permutations.size)
    for (lst in permutations) {
        result += checkCrossWord(lst[0], lst[1], lst[2], lst[3])
    }
    return result
}

fun permute(list: List<String>): List<List<String>> {
    if (list.size == 1) return listOf(list)
    val perms = mutableListOf<List<String>>()
    val sub = list[0]
    for (perm in permute(list.drop(1)))
        for (i in 0..perm.size) {
            val newPerm = perm.toMutableList()
            newPerm.add(i, sub)
            perms.add(newPerm)
        }
    return perms
}

fun checkCrossWord(a: String, b: String, c: String, d: String): Int {
    var count = 0
    for (i in a.indices) {
        for (j in b.indices) {
            for (k in c.indices) {
                for (l in d.indices) {
                    for (i1 in i + 2 until a.length) {
                        for (k1 in k + 2 until c.length) {
                            val b1 = j + i1 - i
                            val d1 = l + k1 - k
                            if (b1 < b.length && d1 < d.length) {
                                if (a[i] == c[k] && a[i1] == d[l] && b[j] == c[k1]
                                    && b[b1] == d[d1]) {
                                    count++
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return count
}