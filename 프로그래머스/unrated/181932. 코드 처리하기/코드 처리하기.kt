class Solution {
    fun solution(code: String): String {
        var answer: String = ""
        var mode: Int = 0
        
        for (i in code.indices) {
            if (mode == 0) {
                if (code[i].toString() == "1") {
                    mode = 1
                    continue
                }
                
                if (i % 2 == 0) {
                    answer += code[i]
                    continue
                }
            }
            
            if (mode == 1) {
                if (code[i].toString() == "1") {
                    mode = 0
                    continue
                }
                
                if (i % 2 == 1) {
                    answer += code[i]
                    continue
                }
            }
        }
        
        return if (answer == "") "EMPTY" else answer
    }
}