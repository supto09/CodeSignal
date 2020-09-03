package godaddy

fun domainType(domains: MutableList<String>): MutableList<String> {
    val result: List<String> =   domains.map{ domain->
        return@map when(domain.substringAfterLast('.')){
            "com"->"commercial"
            "org"->"organization"
            "net"->"network"
            "info"->"information"
            else->""
        }
    }

    return result.toMutableList()
}