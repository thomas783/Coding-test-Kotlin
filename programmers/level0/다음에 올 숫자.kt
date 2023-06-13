class Solution {
    fun solution(common: IntArray): Int{
        var answer: Int = 0
        val i = common[1] - common[0]
        val type = common[1] + i == common[2] // true면 등차수열, false면 등비수열
        if (type){
            answer = common[common.lastIndex] + i
        } else {
            val multiplyNum = common[1] / common[0]
            answer = common[common.lastIndex] * multiplyNum
        }
        return answer
    }
}