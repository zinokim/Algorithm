class Solution {
    fun solution(a: Int, b: Int): Int {
        return when {
            a % 2 == 1 && b % 2 == 1 -> a * a + b * b
            a % 2 == 0 && b % 2 == 0 -> if (a - b < 0) (a - b) * (-1) else a - b
            else -> 2 * (a + b)
        }
    }
}