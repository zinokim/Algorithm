class Solution {
    fun solution(my_strings: Array<String>, parts: Array<IntArray>): String {
        var answer: String = ""
        
        for (i in 0 until my_strings.size) {
            val start:Int = parts[i][0]
            val end:Int = parts[i][1] + 1
            
            answer += my_strings[i].substring(start, end)
        }
        
        return answer
    }
}