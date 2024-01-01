class Solution {
    fun solution(my_string: String, indices: IntArray): String {
        var answer: MutableList<Char> = my_string.toMutableList()
        
        for (i in indices) {
            answer.set(i, ' ')
        }
        
        return answer.filter { it != ' ' }.joinToString("")
    }
}