class Solution {
    fun solution(binomial: String): Int {
        val arr = binomial.split(" ")
        val a = arr[0].toInt()
        val b = arr[2].toInt()
        
        return when (arr[1]) {
            "+" -> a + b
            "-" -> a - b
            else -> a * b
        }
    }
}