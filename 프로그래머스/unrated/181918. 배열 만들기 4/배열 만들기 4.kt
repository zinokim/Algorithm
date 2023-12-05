class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()
        
        var i: Int = 0
        
        while(i < arr.size) {
            if (stk.isEmpty()) {
                stk += arr[i++]
            } else if (stk[stk.lastIndex] < arr[i]) {
                stk += arr[i++]
            } else {
                stk = stk.copyOfRange(0, stk.lastIndex)
            }
        }
        
        return stk
    }
}