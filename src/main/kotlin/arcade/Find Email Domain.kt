package arcade

fun findEmailDomain(address: String): String {
    return address.substringAfterLast("@","")
}
