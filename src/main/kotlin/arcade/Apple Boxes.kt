package arcade

fun appleBoxes(k: Int): Int = (1..k).sumBy { it * it * if (it % 2 == 0) 1 else -1 }
