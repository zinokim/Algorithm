class Solution {
    fun solution(nums: IntArray, n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in 0 until nums.size step n) {
            answer += nums[i]
        }
        
        return answer
    }
}