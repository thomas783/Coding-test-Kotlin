class Solution {
    fun solution(a: Int, d: Int, included: BooleanArray): Int {
        var answer: Int = 0
        for (idx in 0 until included.size) {
            if (included[idx]) answer += a + d * idx
        }
        return answer
    }
}