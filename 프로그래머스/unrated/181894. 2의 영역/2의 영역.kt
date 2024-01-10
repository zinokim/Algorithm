class Solution {
    fun solution(arr: IntArray): IntArray {
        val first: Int = arr.indexOfFirst { it == 2 }
        val last: Int = arr.indexOfLast { it == 2 }
        
        return if (first > -1) arr.copyOfRange(first, last + 1) else intArrayOf(-1)
    }
}