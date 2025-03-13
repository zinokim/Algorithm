class Solution {
    fun solution(myString: String, pat: String): Int {
        val reversed = myString.map { 
            when(it) {
                'A' -> 'B'
                'B' -> 'A'
                else -> it
            }
        }.joinToString("")
        
        return if(reversed.contains(pat)) 1 else 0
    }
}