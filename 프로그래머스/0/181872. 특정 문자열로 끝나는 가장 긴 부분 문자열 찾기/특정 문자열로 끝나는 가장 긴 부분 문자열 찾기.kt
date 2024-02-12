class Solution {
    fun solution(myString: String, pat: String): String {
        return myString.substring(0, myString.lastIndexOf(pat.last()) + 1)
    }
}