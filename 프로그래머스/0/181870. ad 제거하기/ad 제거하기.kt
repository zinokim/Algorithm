class Solution {
    fun solution(strArr: Array<String>): Array<String> {
        var answer: Array<String> = arrayOf<String>()
        
        for(i in 0 until strArr.size) {
            val index = strArr[i].indexOf("ad")
            
            if (index == -1) {
                answer += strArr[i]
            }
        }
        
        return answer
    }
}