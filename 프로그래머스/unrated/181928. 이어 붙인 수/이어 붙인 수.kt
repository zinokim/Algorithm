class Solution {
    fun solution(num_list: IntArray): Int {
        val odd = num_list.map { it -> if (it % 2 == 1) it else "" }.joinToString("").toInt()
        val even = num_list.map { it -> if (it % 2 == 0) it else "" }.joinToString("").toInt()
        
        return odd + even
    }
}