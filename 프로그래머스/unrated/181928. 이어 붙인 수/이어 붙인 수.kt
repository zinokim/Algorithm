class Solution {
    fun solution(num_list: IntArray): Int {
        return (
            num_list.map { it -> if (it % 2 == 1) it else "" }.joinToString("").toInt() 
            + num_list.map { it -> if (it % 2 == 0) it else "" }.joinToString("").toInt()
        )
    }
}