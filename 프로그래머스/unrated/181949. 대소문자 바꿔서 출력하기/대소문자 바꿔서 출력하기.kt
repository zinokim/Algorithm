fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    for (s in s1) {
        val str = if (s.isUpperCase()) s.toLowerCase() else s.toUpperCase()
        print(str)
    }
}