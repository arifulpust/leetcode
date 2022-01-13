package jp.co.leetcode

class LongestCommonPrefix {

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            println(longestCommonPrefix(arrayOf("dog","racecar","car")))
        }

        fun longestCommonPrefix(strs: Array<String>): String {
            var prefix:String =""
            var min=201
            for (i in 0..strs.size-1) {
                min= if (strs[i].length <= min) strs[i].length else min
            }
            var isPrefexAvail:Boolean=true
            for (i in 0..min-1) {
                for (j in 0..strs.size-1) {
                    if(strs[0].get(i)!=strs[j].get(i))
                    {
                        isPrefexAvail=false
                    }
                }
                if(isPrefexAvail)
                prefix+=strs[0].get(i)
                else
                     break
            }


return prefix
        }
        }
}