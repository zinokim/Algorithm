import kotlin.math.max

class Solution {
    fun solution(a: Int, b: Int): Int {
        val first = a.toString().plus(b).toInt()
        val second = b.toString().plus(a).toInt()
        
        return max(first, second)
    }
}