package arcade

fun addBorder(picture: MutableList<String>): MutableList<String> {
    val result = mutableListOf<String>()

    for(row in 0 until  picture.size+2){
        val stringBuilder  = StringBuilder()
        for(column in 0 until picture[0].length+2){
            val character =  if(row == 0 || row == picture.size+1 || column == 0 || column == picture[0].length+1){
                '*'
            } else{
                picture[row-1][column-1]
            }
            stringBuilder.append(character)
        }
        result.add(stringBuilder.toString())
    }

    return result
}
