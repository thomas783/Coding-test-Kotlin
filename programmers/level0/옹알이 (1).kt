class Solution {
    fun solution(babbling: Array<String>): Int {
        val answer: Int
        answer = babbling.count {
            it.isNotEmpty() && it.split("aya","ye","woo","ma").none {
                it.isNotEmpty()
            }
        }
        return answer
    }
}