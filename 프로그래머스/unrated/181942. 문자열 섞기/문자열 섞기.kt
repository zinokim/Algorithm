class Solution {
    fun solution(str1: String, str2: String): String {
        return str1.zip(str2).map { "${it.first}${it.second}" }.joinToString("")
    }
}