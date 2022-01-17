package jp.co.leetcode.array

class LeetCode_1_TwoSum {
    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            println(twoSum(intArrayOf(-11,7,3,2,1,7,-10,11,21,3)
                , 11))
        }

        fun twoSum(nums: IntArray, target: Int): IntArray {
            var savedMap: HashMap<Int, Int> = HashMap<Int, Int>()

            var temp:Int=0
            for (i in 0..nums.size - 1) {
                temp=target-nums[i]
                if(savedMap.containsKey(temp))
                {
                   // println(savedMap.getValue(temp).toString()+"  "+i)
                    return intArrayOf(savedMap.getValue(temp),i)
                }
                savedMap.put(nums[i],i)
            }
            return intArrayOf(0,0)

        }


    }
}