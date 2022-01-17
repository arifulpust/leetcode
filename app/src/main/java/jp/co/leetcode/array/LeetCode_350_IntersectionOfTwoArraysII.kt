package jp.co.leetcode.array

import java.lang.Math.abs

class LeetCode_350_IntersectionOfTwoArraysII {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(intersect(intArrayOf(4,9,5),intArrayOf(2,2)))
        }
        fun intersect(a: IntArray, b: IntArray): IntArray {
            var arr = intArrayOf()
            val list = mutableListOf<Int>()
            var nums1=a
            var nums2=b

            if(nums1.size>nums2.size) {
                var  t = nums1
                nums1 = nums2
                nums2= t
            }
            var occurs:Int=-1
            for (item in nums1) {
                occurs=nums2.indexOf(item)
                if (occurs>= 0)
             {
                     list.add(item)
                 nums2[occurs]=-1

             }

         }
            arr=list.toIntArray()
//            for(item in arr)
//            {
//                println(item)
//            }

return  arr
        }



    }
}