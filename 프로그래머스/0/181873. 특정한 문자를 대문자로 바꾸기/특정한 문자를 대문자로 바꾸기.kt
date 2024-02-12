class Solution {
    fun solution(myString: String, alp: String): String {
        var answer: String = ""
        
        for (i in myString.indices) {
            answer += if (myString[i].toString() == alp) myString[i].uppercase() else myString[i]
        }
        
        return answer
    }
}