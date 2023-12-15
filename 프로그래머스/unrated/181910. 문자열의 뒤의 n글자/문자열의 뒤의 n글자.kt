class Solution {
    fun solution(my_string: String, n: Int): String {
        val strLength = my_string.length
        return my_string.substring(strLength - n, strLength)
    }
}