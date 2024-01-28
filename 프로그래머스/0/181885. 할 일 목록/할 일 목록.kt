class Solution {
    fun solution(todos: Array<String>, finished: BooleanArray): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for (i in 0 until todos.size) {
            if (!finished[i]) {
                answer += todos[i]
            }
        }
        
        return answer
    }
}