package arcade

fun htmlEndTagByStartTag(startTag: String): String {
    val tag = startTag.split(" ")[0].replace("<","").replace(">","")
    return "</$tag>"
}
