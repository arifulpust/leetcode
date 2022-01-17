package jp.co.leetcode.array

class LeetCode_217ContainsDuplicateII {
    companion object {
    @JvmStatic
    fun main(args: Array<String>) {
        println(containsDuplicate(intArrayOf(3, 3,1)))
    }

    fun containsDuplicate(nums: IntArray): Boolean {
        nums.sort()

for(index in 1..nums.size-1)
{
 if(nums[index]==nums[index-1])
     return true
}

return  false

    }
}
}