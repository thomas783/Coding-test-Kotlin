class Solution{
    fun solution(numLog:IntArray): String{
        var answer = ""
        val map = mapOf(1 to "w",-1 to "s",10 to "d",-10 to "a")
        for (idx in 1 until numLog.size){
            answer += map.getValue(numLog[idx] - numLog[idx-1])
        }
        return answer
    }
}