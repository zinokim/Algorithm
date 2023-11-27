class Solution {
    fun solution(n: Int): Int {
        return if (n % 2 == 0) (n downTo 0 step 2).map { it * it }.sum()
        else (n downTo 0 step 2).sum()
    }
}