package arcade

fun reverseInParentheses(inputString: String): String {
    var string = inputString
    while (string.contains("(")) {
        val subString = string.substringAfterLast('(').substringBefore(')')
        string = string.replace("($subString)", subString.reversed())
    }
    return string
}