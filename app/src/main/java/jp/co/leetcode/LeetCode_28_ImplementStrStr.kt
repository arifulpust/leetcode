package jp.co.leetcode

class LeetCode_28_ImplementStrStr {

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            println(strStr("aaaaa","bba"))
        }
        fun strStr(haystack: String, needle: String): Int {
            var occurance=haystack.indexOf(needle)
            return occurance

        }



    }
}