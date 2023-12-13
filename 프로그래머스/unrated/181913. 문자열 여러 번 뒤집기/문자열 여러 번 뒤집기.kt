class Solution {
    fun solution(my_string: String, queries: Array<IntArray>): String {
        var answer: String = my_string
        
        for (i in 0 until queries.size) {
            var str = ""
            for (j in queries[i][1] downTo queries[i][0]) {
                str += answer[j]
            }
            
            answer = answer.replaceRange(queries[i][0], queries[i][1] + 1, str)
        }
        
        return answer
    }
}