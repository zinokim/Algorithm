class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var answer: String = ""
        
        for (i in e downTo s) {
            answer += my_string[i]
        }
        
        return my_string.replaceRange(s, e + 1, answer)
    }
}