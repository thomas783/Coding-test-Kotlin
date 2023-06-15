class Solution {
    fun solution(num_list: IntArray): Int {
        val multiply = num_list.reduce{total,num -> total * num}
        val add = num_list.sum() * num_list.sum()
        return if(multiply < add) 1 else 0
    }
}