package jp.co.leetcode.array

import java.lang.Math.abs

class LeetCode_136_Single_Number {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(singleNumber(intArrayOf(4,1,2,1,2)))
        }
        fun singleNumber(nums: IntArray): Int {

            for (item in nums) {
                var occurs=nums.count { it == item }
                if (occurs==1)
             {
             return  item
             }
         }

return  0
        }



    }
}