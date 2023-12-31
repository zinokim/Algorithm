class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (query in queries) {
            var temp: IntArray = intArrayOf()
            
            for (i in 0..arr.lastIndex) {
                if (query[0] <= i && i <= query[1]) {
                    temp += arr[i]
                } else {
                    continue
                }
            }
            
            answer += temp.filter { it -> query[2] < it }.minOrNull() ?: -1
        }
        
        return answer
    }
}