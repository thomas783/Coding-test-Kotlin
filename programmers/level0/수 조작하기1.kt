class Solution {
    fun solution(n: Int, control: String): Int {
        var answer = n
        control.map { it.toString() }.forEach {
            when {
                it == "w" -> answer += 1
                it == "s" -> answer -= 1
                it == "d" -> answer += 10
                it == "a" -> answer -= 10
                else -> answer
            }
        }
        return n
    }
}