package arcade

fun countSumOfTwoRepresentations2(n: Int, l: Int, r: Int): Int {
    return (l .. n/2).count { n - it in l .. r }
}
