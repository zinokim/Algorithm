class Solution {
    fun solution(number: String): Int {
        val sum = number.map { it.toString().toInt() }.sum()
        
        return sum % 9
    }
}