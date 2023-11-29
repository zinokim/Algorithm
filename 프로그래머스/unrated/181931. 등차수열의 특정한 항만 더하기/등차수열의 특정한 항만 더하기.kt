class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        return included.mapIndexed { 
            index, value -> if (value) (a + (d * index)) else 0 
        }
        .sum()
    }
}