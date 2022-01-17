package jp.co.leetcode.array

class LeetCode_66_Plus_One {
    companion object {
    @JvmStatic
    fun main(args: Array<String>) {
        var value=12123232
        println(plusOne(intArrayOf(7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6)))
    }

    fun plusOne(nums: IntArray): IntArray {


var arraySize:Int=nums.size
        var isAllNineDigit:Boolean=isAllDigitIsNine(nums)
      if(isAllNineDigit)
      {
          arraySize++
      }

       // println(sum)
        if(isAllNineDigit)
        {        var array = IntArray(arraySize) { 0 }

            array[0]=1
            return  array
        }
        nums[nums.size-1]=nums[nums.size-1]+1
        for (index in nums.size-1 downTo 0) {
            if(nums[index]==10)
            {
                nums[index]=0
                nums[index-1]=  nums[index-1]+1
            }
//
        }
//for(item in nums)
//{
//    print(item)
//}


return  nums

    }
        fun isAllDigitIsNine( nums:IntArray):Boolean
        {
                    for(item in nums)
        {
            if(item!=9)
                return false

        }
           return  true

        }
}

}