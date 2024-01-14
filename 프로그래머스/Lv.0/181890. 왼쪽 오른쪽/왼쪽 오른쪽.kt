class Solution {
    fun solution(str_list: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        val left = str_list.indexOf("l")
        val right = str_list.indexOf("r")
        
        if ((left < 0 && right < 0)) {
            return answer
        }
        
        answer = if ((left >= 0 && Math.min(left, right) == left) || right == -1) str_list.copyOfRange(0, left)
        else str_list.copyOfRange(right + 1, str_list.size)
        
        return answer
    }
}