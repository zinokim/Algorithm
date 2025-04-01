import kotlin.math.sqrt

fun main() {
    val (a, b) = readln().split(" ").map { it.toInt() }
    val x1 = (-a + sqrt((a * a - b).toDouble()))
    val x2 = (-a - sqrt((a * a - b).toDouble()))
    val answer = if (x1 == x2) listOf(x1.toInt()) else listOf(x1.toInt(), x2.toInt()).sorted()

    println(answer.joinToString(" "))
}