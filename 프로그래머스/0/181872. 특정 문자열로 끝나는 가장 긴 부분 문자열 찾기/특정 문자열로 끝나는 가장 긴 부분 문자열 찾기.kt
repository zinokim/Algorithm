class Solution {
    fun solution(myString: String, pat: String): String {
        return myString.substringBeforeLast(pat) + pat
    }
}