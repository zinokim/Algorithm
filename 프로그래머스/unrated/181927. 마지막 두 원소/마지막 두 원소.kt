class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list.copyOf()
        val a = num_list.last()
        val b = num_list[num_list.size - 2]
        
        answer += (if (a > b) a - b else a * 2)
        
        return answer
    }
}