class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        val a: Int = slicer[0]
        val b: Int = slicer[1]
        val c: Int = slicer[2]
        
        return when (n) {
            1 -> 0..b
            2 -> a..num_list.lastIndex
            3 -> a..b
            else -> a..b step c
        }.map { num_list[it] }.toIntArray()
    }
}