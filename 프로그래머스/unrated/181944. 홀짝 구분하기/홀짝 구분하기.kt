fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    
    val str = if (a % 2 == 0) "is even" else "is odd"
    print("$a $str")
}