class Solution {
    fun solution(myString: String): Array<String> {
        return myString.split("x").filter { it.isNotBlank() }.sorted().toTypedArray()
    }
}