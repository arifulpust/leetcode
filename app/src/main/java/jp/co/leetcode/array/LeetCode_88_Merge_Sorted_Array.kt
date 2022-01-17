package jp.co.leetcode.array

class LeetCode_88_Merge_Sorted_Array {
    companion object {
    @JvmStatic
    fun main(args: Array<String>) {
        println(merge(intArrayOf(1,2,3,0,0,0),3,intArrayOf(2,5,6),3))
    }
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): IntArray {

            var index:Int=m
            for(point2 in 0.. n-1)
            {
                nums1[index++]=   nums2[point2]
            }
//            for(item in nums1)
//            {
//                print(item.toString()+"  ")
//            }
            nums1.sort()

            return nums1

        }

}
}