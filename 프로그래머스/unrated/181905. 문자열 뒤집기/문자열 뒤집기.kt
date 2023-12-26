class Solution {
    fun solution(my_string: String, s: Int, e: Int): String {
        var reverseStr: String = ""
        
        for (i in e downTo s) {
            reverseStr += my_string[i]
        }
        
        return my_string.replaceRange(s, e + 1, reverseStr)
    }
}