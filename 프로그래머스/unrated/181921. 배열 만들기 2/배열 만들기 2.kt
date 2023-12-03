class Solution {
    fun solution(l: Int, r: Int): IntArray {
        var answer: IntArray = intArrayOf()
        
        for (i in l..r) {
            if (i % 5 != 0 || !i.toString().startsWith("5")) continue
            
            var isTrue: Boolean = true
            for (c in i.toString().toCharArray()) {
                if (c != '0' && c != '5') {
                    isTrue = false
                    break
                }
            }
            
            if (isTrue) {
                answer += i
                isTrue = true
            }
        }
        
        if (answer.size == 0) answer += -1
        
        return answer
    }
}