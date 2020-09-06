package arcade

fun isMAC48Address(inputString: String): Boolean {
    return """[0-9A-F]{2}(-[0-9A-F]{2}){5}""".toRegex().matches(inputString)
}
