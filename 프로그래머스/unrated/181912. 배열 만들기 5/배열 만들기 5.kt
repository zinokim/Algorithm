class Solution {
    fun solution(intStrs: Array<String>, k: Int, s: Int, l: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer += intStrs.map { it -> it.substring(s until s + l).toInt() }
            .filter { it > k }
        
        return answer
    }
}