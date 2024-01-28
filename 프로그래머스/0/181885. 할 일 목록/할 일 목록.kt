class Solution {
    fun solution(todos: Array<String>, finished: BooleanArray): Array<String> {
        return todos.filterIndexed { i, v -> !finished[i] }.toTypedArray()
    }
}