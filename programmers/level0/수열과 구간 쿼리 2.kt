class Solution {
    fun solution(arr: IntArray, queries: Array<IntArray>): IntArray {
        var answer = mutableListOf<Int>()
        queries.forEach { (start, end, criteria) ->
            var tempAnswer = -1
            arr.slice(start..end).forEach {
                if (it > criteria && (tempAnswer > it || tempAnswer == -1)) tempAnswer = it
            }
            answer.add(tempAnswer)
        }
        return answer.toIntArray()
    }
}