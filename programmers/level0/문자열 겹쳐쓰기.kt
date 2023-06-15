class Solution {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        var answer = my_string.substring(0 until s) + overwrite_string
        if (my_string.length > answer.length) {
            answer += my_string.substring(answer.length)
        }
        return answer
    }
}