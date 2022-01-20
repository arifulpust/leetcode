package jp.co.leetcode.string

class LeetCode_12_Integer_to_Roman {
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {


            while(true) {
                val input = readLine()!!.trim().toInt()
                println(intToRoman(input))
            }

        }
        fun intToRoman(num: Int): String  {
            var num = num
            val values = intArrayOf(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1)
            val romanLiterals = arrayOf("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I")
            val roman = StringBuilder()
            for (i in values.indices) {
                while (num >= values[i]) {
                    num -= values[i]
                    roman.append(romanLiterals[i])
                }
            }
            return roman.toString()

        }
    }
}