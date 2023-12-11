class Solution {
    fun solution(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        var x = n
        
        while (x > 1) {
            answer += x
            x = if (x % 2 == 0) x / 2 else 3 * x + 1
            
            if (x == 1) {
                answer += x
                break
            }
        }
        
        return answer
    }
}