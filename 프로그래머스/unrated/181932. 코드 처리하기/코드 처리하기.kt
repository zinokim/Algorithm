class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Int = 0
        
        for (i in code.indices) {
            if (code[i].toString() == "1") {
                mode = if (mode == 0) 1 else 0
                continue
             }
            
            if (mode == 0 && i % 2 == 0) {
                answer += code[i]
                continue
            }
            
            if (mode == 1 && i % 2 == 1) {
                answer += code[i]
                continue
            }
        }
        
        return if (answer == "") "EMPTY" else answer
    }
}