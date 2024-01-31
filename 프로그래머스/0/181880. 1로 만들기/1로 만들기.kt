class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        
        for (i in 0 until numbers.size) {
            var number = numbers[i]
            
            while (number > 1) {
                answer++
                number = if (number % 2 == 0) number / 2 else (number - 1) / 2
            } 
        }
        
        return answer
    }
}