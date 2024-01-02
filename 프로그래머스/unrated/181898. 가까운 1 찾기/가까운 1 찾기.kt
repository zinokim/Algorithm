class Solution {
    fun solution(arr: IntArray, idx: Int): Int {
        for (i in idx until arr.size) {
            if (idx <= i && arr[i] == 1) {
                return i
            }
        }
        
        return -1
    }
}