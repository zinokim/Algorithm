class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        for (query in queries) {
            var temp: IntArray = intArrayOf()
            
            for (i in 0..arr.lastIndex) {
                if (query[0] <= i && i <= query[1]) {
                    temp += i
                }
            }
            
            temp.filter { it -> it % query[2] == 0 }
                .map { it -> arr[it] += 1}
        }
        
        return arr
    }
}