class Solution {
    fun solution(nums: IntArray): Int {
        val odd = (0..nums.lastIndex step 2).map { nums[it] }.sum()
        val even = (1..nums.lastIndex step 2).map { nums[it] }.sum()
        
        return Math.max(odd, even)
    }
}