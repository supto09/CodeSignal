package arcade

fun isUnstablePair(filename1: String, filename2: String): Boolean {
    return filename1.compareTo(filename2) < 0 != filename1.toLowerCase().compareTo(filename2.toLowerCase()) < 0
}
