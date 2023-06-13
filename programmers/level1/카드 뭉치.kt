class Solution {
    fun solution(cards1: Array<String>, cards2: Array<String>, goal: Array<String>): String {
        var answer: String = ""
        var idx1:Int = 0
        var idx2:Int =0
        for (idxGoal in 0..goal.size-1){
            val word = goal[idxGoal]
            if (idx1 < cards1.size && cards1[idx1] == word){
                idx1++
                continue
            }
            if (idx2 < cards2.size && cards2[idx2] == word){
                idx2++
                continue
            }
            return "No"
        }
        return "Yes"
    }
}