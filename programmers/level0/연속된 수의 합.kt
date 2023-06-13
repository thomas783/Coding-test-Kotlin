class Solution {
    fun solution(num: Int, total: Int): IntArray {
        var answer: IntArray = intArrayOf()
        val isOddNum = num % 2 == 1 // true면 홀수개, false면 짝수개
        val centerNum: Int = total / num
        var halfLength: Int
        if (isOddNum) {
            halfLength = (num - 1) / 2
        } else {
            halfLength = num / 2 - 1
        }
        val startNum: Int = centerNum - halfLength
        answer = IntArray(num) { startNum + it }
        return answer
    }
}