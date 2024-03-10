class Solution {
    fun solution(myString: String): IntArray {
        var answer: IntArray = intArrayOf()
        
        val arr: List<String> = myString.split("x")
        for (i in 0 until arr.size) {
            answer = answer.plus(arr[i].length)
        }
        
        return answer
    }
}