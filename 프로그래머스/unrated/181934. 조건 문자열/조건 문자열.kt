class Solution {
    fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
        if (eq == "=") {
            if (ineq == ">") {
                return if (n >= m) 1 else 0
            }
            
            return if (n <= m) 1 else 0
        }
        
        if (ineq == ">") {
            return if (n > m) 1 else 0
        }
        
        return if (n < m) 1 else 0
    }
}