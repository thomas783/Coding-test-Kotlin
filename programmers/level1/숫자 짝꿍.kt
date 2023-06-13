import kotlin.math.min

class Solution {
    fun solution(X: String, Y: String): String {
        var answer: String = ""
        for (ch in (9 downTo 0).toList().map { it.toString() }) {
            answer += ch.repeat(
                min(
                    X.count {
                        it.toString() == ch
                    },
                    Y.count {
                        it.toString() == ch
                    }
                )
            )
        }
        if (answer.isEmpty()) return "-1"
        if (answer.toList().distinct()==listOf('0')) answer = "0"
        return answer
    }
}