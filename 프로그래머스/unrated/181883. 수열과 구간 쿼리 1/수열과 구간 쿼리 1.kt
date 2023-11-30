class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in 0..arr.lastIndex) {
            for (query in queries) {
                arr[i] += if (query[0] <= i && i <= query[1]) 1 else 0
            }
            
            answer += arr[i]
        }
        
        return answer
    }
}