package arcade

fun properNounCorrection(noun: String): String {
    return "${noun[0].toUpperCase()}${noun.substring(1).toLowerCase()}"
}
