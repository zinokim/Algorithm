class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer: IntArray = IntArray(arr.size)
        
        for (i in 0 until arr.size) {
            val number: Int = arr[i]
            
            answer[i] = if (number >= 50 && number % 2 == 0) number / 2
            else if (number < 50 && number % 2 == 1) number * 2
            else number
        }
        
        return answer
    }
}