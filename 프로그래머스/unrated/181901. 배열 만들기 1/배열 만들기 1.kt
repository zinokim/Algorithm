class Solution {
    fun solution(n: Int, k: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in 1..n) {
            if (i % k != 0) continue
            
            answer += i
        }
        
        return answer
    }
}