class Solution {
    fun solution(arr: IntArray): IntArray {
        var stk: IntArray = intArrayOf()
        
        var i:Int = 0
        
        while (i < arr.size) {
            if (stk.isEmpty()) {
                stk += arr[i++]
            } else if (stk[stk.lastIndex] == arr[i]) {
                stk = stk.copyOfRange(0, stk.lastIndex)
                i++
            } else {
                stk += arr[i++]
            }
        }
        
        if (stk.size == 0) stk += -1
        
        return stk
    }
}