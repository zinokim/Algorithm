class Solution {
    fun solution(arr: Array<String>): String {
        return arr.map { "$it" }.joinToString("")
    }
}