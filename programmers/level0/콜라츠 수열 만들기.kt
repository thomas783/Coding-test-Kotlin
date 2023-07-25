class Solution {
    fun solution(n: Int): IntArray {
        var answer = mutableListOf<Int>()
        answer.add(n)
        while (answer[answer.size - 1] != 1) {
            if (answer[answer.size - 1] % 2 == 0) answer.add(answer[answer.size - 1] / 2)
            else answer.add(answer[answer.size - 1] * 3 + 1)
        }
        return answer.toIntArray()
    }
}