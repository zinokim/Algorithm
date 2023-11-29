import kotlin.math.*

class Solution {
    fun solution(num_list: IntArray): Int {
        val a: Int = num_list.reduce { acc, num -> acc * num }
        val b: Int = num_list.sum().toDouble().pow(2.0).toInt()
        
        return if (a < b) 1 else 0
    }
}