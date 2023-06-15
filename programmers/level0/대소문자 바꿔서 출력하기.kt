fun main(args: Array<String>) {
    val s1 = readLine()!!
    s1.map { if (it.isLowerCase()) it.toUpperCase() else it.toLowerCase() }
        .joinToString("")
        .also { println(it) }
}