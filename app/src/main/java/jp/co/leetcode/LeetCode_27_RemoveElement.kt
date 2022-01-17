package jp.co.leetcode

class LeetCode_27_RemoveElement {

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            println(removeElement(intArrayOf(3, 2, 2,3), 3))
        }

        fun removeElement(nums: IntArray, input: Int): Int {

            var index = 0
            for (i in 0..nums.size - 1) {
                if (input != nums[i]) {
                    nums[index++] = nums[i]
                }

            }
//            for(i in 0..nums.size-1)
//            {
//                println(nums[i])
//            }

            return index

        }


    }
}