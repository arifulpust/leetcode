package jp.co.leetcode.string

class LeetCode_58_Length_of_Last_Word {
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {


            while(true) {
                val input = readLine()!!.trim()
                println(lengthOfLastWord(input))
            }

        }
        fun lengthOfLastWord(num: String): Int  {
            val words = num.split("\\s+".toRegex())
            return words[words.size-1].length

        }
    }
}