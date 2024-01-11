class Solution {
    fun solution(arr: IntArray, query: IntArray): IntArray {
        var answer = arr
        
        for (i in 0 until query.size) {
            answer = if (i % 2 == 0) answer.slice(0 until query[i] + 1).toIntArray() 
            else answer.slice(query[i] until answer.size).toIntArray()
        }
        
        return answer
    }
}