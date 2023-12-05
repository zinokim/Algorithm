class Solution {
    fun solution(arr: IntArray, intervals: Array<IntArray>): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in intervals) {
            for (v in i[0]..i[1]) {
                answer += arr[v]
            }
        }
        
        return answer
    }
}