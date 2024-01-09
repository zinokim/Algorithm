class Solution {
    fun solution(n: Int, slicer: IntArray, num_list: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        val a: Int = slicer[0]
        val b: Int = slicer[1]
        val c: Int = slicer[2]
        
        return when (n) {
            1 -> num_list.copyOfRange(0, (b + 1))
            2 -> num_list.copyOfRange(a, num_list.size)
            3 -> num_list.copyOfRange(a, (b + 1))
            else -> num_list.copyOfRange(a, (b + 1)).filterIndexed { index, num -> index % c == 0 }.toIntArray()
        }
    }
}