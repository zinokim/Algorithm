class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        
        answer = arr.map {
            if (it >= 50 && it % 2 == 0) {
                it / 2
            } else if (it < 50 && it % 2 == 1) {
                it * 2
            } else {
                it
            }
        }.toIntArray()
        
        return answer
    }
}