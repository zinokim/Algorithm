fun main(args: Array<String>) {
    val s1 = readLine()!!
    val result = s1.map { it -> if (it.isUpperCase()) it.toLowerCase() else it.toUpperCase() }
            .joinToString("")
    
    print(result)
}