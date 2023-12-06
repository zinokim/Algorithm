class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        return intStrs.map { it -> it.substring(s until s + l).toInt() }
            .filter { it > k }
            .toIntArray()
    }
}