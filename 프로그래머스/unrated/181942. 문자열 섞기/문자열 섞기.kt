class Solution {
    fun solution(str1: String, str2: String): String {
        return str1.zip(str2).joinToString("") { (a, b) -> "$a$b" }
    }
}