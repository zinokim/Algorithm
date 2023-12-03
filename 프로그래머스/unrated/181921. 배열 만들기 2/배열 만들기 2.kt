class Solution {
    private val numList: MutableList<Int> = mutableListOf()

    fun solution(l: Int, r: Int): IntArray {
        dfs(0, "5")

        val result = numList.sorted().filter { it in l..r }.toIntArray()

        return if (result.isEmpty()) intArrayOf(-1) else result
    }

    private fun dfs(depth: Int, num: String) {
        if (depth == 6) return

        numList.add(num.toInt())

        dfs(depth + 1, num + "0")
        dfs(depth + 1, num + "5")
    }
}