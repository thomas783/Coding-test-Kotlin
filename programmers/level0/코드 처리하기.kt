class Solution {
    fun solution(code: String): String {
        var ret:String = ""
        var mode:Boolean = false
        for (idx in 0 until code.length){
            if (code[idx].toString() == "1"){
                mode = !mode
            } else {
                if (idx % 2 == 0 && !mode || idx % 2 == 1 && mode){
                    ret += code[idx]
                }
            }
        }
        if (ret.length > 0) return ret
        else return "EMPTY"
    }
}