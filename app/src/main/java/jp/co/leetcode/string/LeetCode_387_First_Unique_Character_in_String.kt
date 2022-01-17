package jp.co.leetcode.string

import jp.co.leetcode.LeetCode_21_MergeTwoSortedLists
import java.util.ArrayList

class LeetCode_387_First_Unique_Character_in_String {
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {



            //  println(isValidSudoku(arrayOf(intArrayOf(1,2),intArrayOf(3,4)),1,4))
        }
        fun firstUniqChar(s: String): Int {

            var savedMap: HashMap<Char, Int> = HashMap<Char, Int>()
            for(i in 0..s.length-1)
            {

                if(savedMap.containsKey(s[i]))
                {
                    savedMap.set(s[i],(savedMap.get(s[i])?.plus(1)!!))
                }else
                {
                    savedMap.put(s[i],(savedMap.get(s[i])?.plus(1)!!))
                }

            }
      return 0


        }
    }
}