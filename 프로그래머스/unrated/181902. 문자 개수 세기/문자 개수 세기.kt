class Solution {
    fun solution(my_string: String): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in 65..90) {
            answer += calculate(my_string, i)
        }
        
        for (i in 97..122) {
            answer += calculate(my_string, i)
        }
        
        return answer
    }
    
    fun calculate(my_string: String, char: Int): Int {
        var count: Int = 0
            
        for (ch in 0 until my_string.length) {
            val code = my_string[ch].toInt()
            if (char == code) {
                count ++
            }
        }
        
        return count
    }
}