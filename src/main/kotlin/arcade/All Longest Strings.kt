package arcade

//Given an array of strings, return another array containing all of its longest strings.

fun allLongestStrings(inputArray: MutableList<String>): MutableList<String> {
    val x: List<String> = inputArray.groupBy{it.length}.maxBy{it.key}?.value ?: listOf()
    return x.toMutableList()
}
