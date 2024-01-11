class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr
        
        query.forEachIndexed { i, v -> 
            answer = if (i % 2 == 0) answer.slice(0 until (v + 1)).toIntArray()
            else answer.slice(v until answer.size).toIntArray()
        }
        
        return answer
    }
}