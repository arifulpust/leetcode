package jp.co.leetcode

class LeetCode_35_Search_Insert_Position {

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            println(searchInsert(intArrayOf(1, 3, 5,6), 5))
        }

        fun searchInsert(nums: IntArray, input: Int): Int {

            var index:Int=-1
            for (i in 0..nums.size - 1) {
                if (input<=nums[i]) {
                    index= i
                    break
                }

            }
            if(nums.size>0&&index==-1)
                index=nums.size
            return index

        }


    }
}