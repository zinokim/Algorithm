class Solution {
    fun solution(my_string: String, m: Int, c: Int): String {
        val arr: List<String> = my_string.chunked(m)
        return arr.map { it[c - 1] }.joinToString("")
    }
}