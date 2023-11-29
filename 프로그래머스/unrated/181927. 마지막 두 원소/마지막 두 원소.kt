class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer: IntArray = num_list.copyOf(num_list.size + 1)
        val a = num_list.last()
        val b = num_list[num_list.size - 2]
        
        answer[num_list.size] = (if (a > b) a - b else a * 2)
        
        return answer
    }
}