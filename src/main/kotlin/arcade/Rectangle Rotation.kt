package arcade

fun rectangleRotation(a: Int, b: Int): Int {
    var result = 0
    for (i in -a-b..a+b) {
        for (j in -a-b..a+b) {
            if (isPointInPlane(Pair(i, j), a, b)) {
                result++
            }
        }
    }
    return result
}

fun isPointInPlane(point: Pair<Int, Int>, a: Int, b: Int): Boolean {
    val x = point.first
    val y = point.second
    val c1 = 2 * (x - y) * (x - y) < a * a
    val c2 = 2 * (x + y) * (x + y) < b * b
    return c1 && c2
}