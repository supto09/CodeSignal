package arcade

fun lineUp(commands: String): Int {

    var currValid = true

    return commands.map {
        when(it){
            'L' -> currValid = !currValid
            'R' -> currValid = !currValid
            'A' -> currValid
            else -> currValid
        }
        currValid
    }.count { it }
}
