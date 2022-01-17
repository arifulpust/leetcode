package jp.co.leetcode

import java.util.ArrayList

class LeetCode_26_RemoveDuplicatesfromSortedArray {

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
//var array=mergeTwoLists([11,2],[1,1])
//            for(i in 0.. array.size-1)
//            {
//                print(array[i].toString()+"  ")
//            }
println(removeDuplicates(intArrayOf(1, 1,2)))
        }

        fun removeDuplicates(nums: IntArray): Int {

            var index=0
            var value=0
            if(nums.size>0)
            {
                index++
                value=nums[0]
            }

            for(i in 1..nums.size-1)
            {
              if(value!=nums[i])
              {
                  value=nums[i]
                  nums[index]=value
                  index++

              }

            }

return index

        }


}
}