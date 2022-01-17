package jp.co.leetcode.array

class LeetCode_121_Best_Time_to_BuySellStock {
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {
            println(maxProfit(intArrayOf(1,2)))
        }
        fun maxProfit(nums: IntArray): Int {

            var max=Int.MIN_VALUE
            var min=Int.MAX_VALUE
            var largest:Int=Int.MIN_VALUE

            for (item in nums) {
                if (item > max) {
                    max = if (item > max) item else max
                    min = if (min > item) item else min
                    if((max-min)>largest)
                        largest=max-min
                }
                else
                {
                    if((max-min)>largest)
                        largest=max-min
                     max=Int.MIN_VALUE
                    min = if (min > item) item else min
                }
            }

            if(largest<0)
                return 0
           return  largest

        }
    }
}