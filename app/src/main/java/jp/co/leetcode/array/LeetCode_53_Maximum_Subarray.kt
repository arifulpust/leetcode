package jp.co.leetcode.array

class LeetCode_53_Maximum_Subarray {

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            println(maxSubArray(intArrayOf(5,4,-1,7,8)))
        }



        fun maxSubArray(a: IntArray): Int {
            val size = a.size
            var max_so_far = Int.MIN_VALUE
            var max_ending_here = 0
            for (i in 0 until size) {
                max_ending_here = max_ending_here + a[i]
                if (max_so_far < max_ending_here) max_so_far = max_ending_here
                if (max_ending_here < 0) max_ending_here = 0
            }
            return max_so_far
        }


    }
}