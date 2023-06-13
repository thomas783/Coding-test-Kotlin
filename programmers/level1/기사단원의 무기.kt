import kotlin.math.sqrt

class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0
        val divisorList = mutableListOf<Int>()
        for (n in 1..number){
            divisorList.add(findDivisor(n))
        }
        divisorList.forEach{
            if (it > limit){
                answer += power
            }
            else {
                answer += it
            }
        }
        return answer
    }

    fun findDivisor(number:Int): Int {
        val sqrt = sqrt(number.toDouble())
        var result = 0
        for (i in 1..sqrt.toInt()){
            if (number % i == 0){
                result += 1
                if (number / i !=i){
                    result += 1
                }
            }
        }
        return result
    }
}