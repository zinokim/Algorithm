class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        return strArr.filter { it.contains("ad").not() }.toTypedArray()
    }
}