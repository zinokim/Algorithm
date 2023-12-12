class Solution {
    fun solution(my_string: String, index_list: IntArray): String {
        return index_list.map { it -> my_string[it] }.joinToString("")
    }
}