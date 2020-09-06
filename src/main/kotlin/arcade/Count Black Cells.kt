package arcade

fun countBlackCells(n: Int, m: Int) = n + m + gcd(n, m) - 2

fun gcd(a: Int, b: Int): Int = when {
    b == 0 -> a
    else -> gcd(b, a % b)
}
