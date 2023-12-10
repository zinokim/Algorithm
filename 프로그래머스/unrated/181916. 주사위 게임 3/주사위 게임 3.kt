class Solution {
    fun solution(a: Int, b: Int, c: Int, d: Int): Int {
        val list = listOf(a, b, c, d)
        val sets = list.toSortedSet()
        
        if (sets.size == 1) {
            return 1111 * sets.first()
        }
        
        if (sets.size == 2) {
            if (list.count { el -> el == sets.first() } == 2) {
                return (sets.first() + sets.last()) * Math.abs(sets.first() - sets.last())
            } else {
                val p = if (list.count { el -> el == sets.first() } == 3) sets.first() else sets.last()
                val q = if (p == sets.first()) sets.last() else sets.first()
                
                return (10 * p + q) * (10 * p + q)
            }
        }
        
        if (sets.size == 4) {
            return list.minOf { it }
        }
        
        val p = sets.filter { iter -> list.count { el -> el == iter } == 2 }
        sets.removeAll(p)
        
        return sets.first() * sets.last()
    }
}