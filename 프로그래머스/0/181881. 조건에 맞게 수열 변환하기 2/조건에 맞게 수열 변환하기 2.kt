class Solution {
    fun solution(arr: IntArray): Int {
        var answer: Int = 0
        var numbers: IntArray = IntArray(arr.size)
        var arrs: IntArray = arr
        
        while (!numbers.contentEquals(arrs)) {
            answer++
            val temp: IntArray = arrs.clone()
            
            for (i in 0 until temp.size) {
                val number = temp[i]

                arrs[i] = if (number >= 50 && number % 2 == 0) number / 2
                else if (number < 50 && number % 2 == 1) (number * 2) + 1
                else number
            }
            
            numbers = temp
        }
        
        return answer - 1
    }
}