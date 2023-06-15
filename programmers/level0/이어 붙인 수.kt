class Solution {
    fun solution(num_list: IntArray): Int {
        val odd = num_list.filter { it % 2 == 1 }.map { it.toString() }.joinToString("").toInt()
        val even = num_list.filter { it % 2 == 0 }.map { it.toString() }.joinToString("").toInt()
        return odd + even
    }
}