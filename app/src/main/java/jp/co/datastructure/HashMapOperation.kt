package jp.co.datastructure

class HashMapOperation {
//LeetCode_387_First_Unique_Character_in_String

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
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        if(ransomNote.contains(magazine))
            return true
        else return false

    }
}