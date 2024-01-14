class Solution {
    fun solution(num_list: IntArray, n: Int): IntArray {
        val first = num_list.copyOfRange(n, num_list.size)
        val second = num_list.copyOfRange(0, n)
        
        return first.plus(second)
    }
}