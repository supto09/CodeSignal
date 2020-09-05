package interview

fun climbingStairs(n: Int): Int {
    if(n == 1) return 1
    if(n == 2) return 2

    return climbingStairs(n-1) + climbingStairs (n-2)
}