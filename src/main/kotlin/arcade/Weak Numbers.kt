package arcade

fun weakNumbers(n: Int): MutableList<Int> {
    val arr = (1..n).map{i -> weakness(i)}
    return mutableListOf(arr.max()!!, arr.count { it==arr.max() })
}

fun weakness(x: Int): Int {
    val d = divCount(x)
    return (x-1 downTo 1).count { d < divCount(it) }
}

fun divCount(y: Int): Int = (y-1 downTo 1).count { y%it==0 }